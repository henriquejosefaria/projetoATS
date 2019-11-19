import Test.QuickCheck
import Data.List
import Data.Char

--NovoProp: nome, nif, email,morada
--NovoCliente:nome,nif,email,morada,X,Y
     -- X e Y : posicçao onde se encontra
--NovoCarro:tipo,marca,matricula,nif,velocidade media,preço por km, consumo por km, autonomia, X, Y
     -- X e Y : posicçao onde se encontra
--Aluguer: nif cliente, X destino, Y destino, tipoCombustivel , preferencia
--Classificar: matricula ou nif (cliente ou prop) , nota (0-100)


-- o NomeProprietario serve para distinguir do Nome do Cliente para criar o proprietário 
-- basta-me escrever esse NomeProprietario que serve como construtor
-- identifica o data type
-- NomeProprietário e Aluger são o mesmo
data NovoProprietario = NovoProprietario Nome NIF Email Morada
                      deriving Show

data Cliente          = NovoCliente Nome NIF Email Morada X Y --X e Y são coordenadas
                      deriving Show

data NovoCarro        = Novocarro Tipo Marca Matricula NIF VelocidadeMedia PrecoKm Consumo Autonomia X Y
                      deriving Show

data Aluger           = Aluger NIF X Y Tipo Preferencia
                      deriving Show

data Classificar      = ClassificacaoM Matricula Nota 
                      | ClassificacaoN NIF Nota
                      deriving Show

data Resultado        = NP NovoProprietario
                      | NCL Cliente 
                      | NC NovoCarro
                      | NA Aluger
                      | CL Classificar
                      deriving Show

type Nome            = String
type NIF             = Int           --NIF proprietário/cliente
type Email           = String
type Morada          = String
type X               = Float
type Y               = Float
type Tipo            = String
type Marca           = String
type Matricula       = String
type VelocidadeMedia = Int
type PrecoKm         = Float            --Consumo/Kilometro
type Consumo         = Float
type Autonomia       = Int
type Preferencia     = String
type Nota            = Int

minNifs = 111111111
maxNifs = 999999999
proprios = ["Joao", "Joana", "Manuel"]
vogais = ["a","e","i","o","u"]
consoantes = ["b","c","d","f","g","h","j","l","m","n","p","q","r","s","t","v","x","z"]
freguesias = ["Alhoes", "Bustelo", "Gralheira e Ramires","Cinfães","Espadanedo","Ferreiros de Tendais","Fornelos","Moimenta","Nespereira","Oliveira do Douro","Santiago de Piães","São Cristóvão de Nogueira","Souselo","Tarouquela","Tendais","Travanca"]
marcas = ["Abarth","Adria","Aixam","Alfa Romeo","Aston Martin","Audi","Austin","Austin Morris","Benimar","Bentley","Bertone","BMW","Cadillac","Challenger","Chevrolet","Chrysler","Citroen","Corvette" ,"Dacia","Daewoo" ,"Daihatsu" ,"Datsun","Dodge" ,"DS","Ferrari" ,"Fiat" ,"Ford","Hobby" ,"Honda","Hyundai","Isuzu" ,"Jaguar","JDM" ,"Jeep","Kia","Lamborghini" ,"Lancia","Land Rover","Lexus","Ligier","Lincoln","Lotu","Maserati","Maybach","Mazda","Mercedes-Benz" ,"MG","Microcar","MINI"]
letters = ["AA","AB","AC","AD"]
numbers = ["00","01","02","03","04","05","06","07","08","09"]
preferencias = ["Mais Perto","Mais Barato","Partilhado"]

genNifs::[NIF] -> Int -> Gen [NIF]
genNifs [] n = do x <- choose (minNifs,maxNifs) 
                  genNifs [x] (n-1)
genNifs xs 0  = return xs
genNifs xs n = do x <- choose (minNifs,maxNifs)
                  if elem x xs then genNifs xs n else genNifs (x:xs) (n-1)


-- É para aproveitar melhor as capacidades do quickCheck
genAplido:: [String] -> [String] -> String -> Int -> Gen String
genAplido xs ys r 1 = return r
genAplido xs ys r n = do x <- elements xs
                         y <- elements ys
                         z <- genAplido xs ys (r ++ x ++ y) (n-2)
                         return z

genProprios::Gen String
genProprios = elements proprios

genNome:: Gen String
genNome = do x <- genProprios
             nr <- elements [5,7,9]
             first <- elements consoantes
             y <- genAplido vogais consoantes (map toUpper first) nr
             let nome = x ++ " " ++ y
             return nome

genNomes:: Int -> Gen [String]
genNomes 0 = return []
genNomes n = do nome <- genNome
                list <- genNomes (n-1)
                return (nome : list)

genMorada:: Gen Morada
genMorada = elements freguesias

-- #################################################################### --
-- #################################################################### --
--                          GEN_PROPRIETARIO                            --
-- #################################################################### --
-- #################################################################### --

--NovoProprietario Nome NIF Email Morada
genProprietario::NIF -> Gen NovoProprietario

genProprietario nif = do a    <- genNome 
                         c    <- genMorada
                         let b = show(nif) ++ "@gmail.com"

                         return (NovoProprietario a nif b c)


genProprietarios:: [NIF] -> Gen [NovoProprietario]
genProprietarios [] = return []
genProprietarios (x:xs) = do p <- genProprietario x
                             ps <- genProprietarios xs
                             return (p:ps)


genCoordX:: Gen X
genCoordX = choose (-20.2022700,-32.2022700)

genCoordY:: Gen Y
genCoordY = choose (18.0436300,40.0436300) 


-- #################################################################### --
-- #################################################################### --
--                            GEN_CLIENTE                               --
-- #################################################################### --
-- #################################################################### --

--NovoCliente Nome NIF Email Morada X Y
genCliente::NIF -> Gen Cliente

genCliente nif = do nome     <- genNome
                    morada   <- genMorada
                    coordX   <- genCoordX
                    coordY   <- genCoordY
                    let email = show(nif) ++ "@gmail.com"       
                    return (NovoCliente nome nif email morada coordX coordY)

genClientes:: [NIF] -> Gen [Cliente]
genClientes [] = return []
genClientes (x:xs) = do c <- genCliente x
                        cs <- genClientes xs
                        return (c:cs)

genTipo:: Gen Tipo
genTipo  = frequency [(70,return "Combustão"),(25,return "Hibrido"),(5,return "Eletrico")]

genPrecoKm:: Gen Float
genPrecoKm = choose (0.5,3)

genAutonomia:: Gen Int
genAutonomia = choose (350,500)

genMarca:: Gen String
genMarca = elements marcas

genMatriculaAux::Int -> Gen Matricula
genMatriculaAux x = do a <- elements letters
                       b <- elements numbers 
                       c <- elements numbers
                       if(x == 1) then return (a ++ "-" ++ b ++ "-" ++ c)
                         else if (x == 2) then return (b ++ "-" ++ a ++ "-" ++ c)
                         else return (c ++ "-" ++ b ++ "-" ++ a)

genMatricula:: Gen Matricula
genMatricula = do x <- choose(1,3)
                  genMatriculaAux x

genVelocidadeMedia:: Gen VelocidadeMedia
genVelocidadeMedia = choose(50, 150)

genConsumo:: Gen Consumo
genConsumo = choose(3.5,7.5)


-- #################################################################### --
-- #################################################################### --
--                              GEN_CARRO                               --
-- #################################################################### --
-- #################################################################### --

--Novocarro Tipo Marca Matricula NIF VelocidadeMedia PrecoKm Consumo Autonomia X Y

genCarro::NIF -> Gen NovoCarro

genCarro nif = do tipo   <- genTipo
                  marca  <- genMarca
                  matr   <- genMatricula
                  vel    <- genVelocidadeMedia
                  precKM <- genPrecoKm
                  cons   <- genConsumo
                  aut    <- genAutonomia
                  coordX <- genCoordX
                  coordY <- genCoordY
                  return (Novocarro tipo marca matr nif vel precKM cons aut coordX coordY)

genCarros:: [NIF] -> Gen [NovoCarro]
genCarros [] = return []
genCarros (x:xs) = do c <- genCarro x
                      cs <- genCarros xs
                      return (c:cs)

getMatriculas::[NovoCarro] ->Gen [String]
getMatriculas [] =return []
getMatriculas ((Novocarro _ _ matricula _ _ _ _ _ _ _):xs) = do let m = matricula
                                                                ms <- getMatriculas xs
                                                                return (m:ms) 

genPreferencia:: Gen Preferencia
genPreferencia  = frequency [(65,return "Mais Perto"),(35,return "Mais Barato")]


-- ##################################################################### --
-- ##################################################################### --
--                              GEN_ALUGER                               --
-- ##################################################################### --
-- ##################################################################### --

--Aluger NIF X Y Tipo Preferencia
genAluger::NIF -> Gen Aluger

genAluger nif = do tipo   <- genTipo
                   pref   <- genPreferencia
                   coordX <- genCoordX
                   coordY <- genCoordY
                   return (Aluger nif coordX coordY tipo pref)


genAlugers:: [NIF] -> Gen [Aluger]
genAlugers [] = return []
genAlugers (x:xs) = do a <- genAluger x
                       as <- genAlugers xs
                       return (a:as)


-- ##################################################################### --
-- ##################################################################### --
--                         GEN_CLASSIFICAÇÃO                             --
-- ##################################################################### --
-- ##################################################################### --


-- ClassificacaoM Matricula Nota 
genClassificacaoM::String -> Gen Classificar
genClassificacaoM matricula = do x <- choose(20,100)
                                 return (ClassificacaoM matricula x)


-- ClassificacaoN NIF Nota
genClassificacaoN::NIF -> Gen Classificar
genClassificacaoN nif = do x <- choose(20,100)
                           return (ClassificacaoN nif x)

genClassificacoes:: [NIF] -> [String] -> Gen [Classificar]
genClassificacoes [] []     = return []
genClassificacoes [] (y:ys) = do a <- genClassificacaoM y
                                 as <- genClassificacoes [] ys
                                 return (a:as)
genClassificacoes (x:xs) ys = do a <- genClassificacaoN x
                                 as <- genClassificacoes xs ys
                                 return (a:as)


--resultWritter:: [String] -> [String] -> [String] ->[String] -> [String] -> Bool

--resultWritter a b c d e = do handle <- openFile "girlfriend.txt" WriteMode
--                             map (print) a



genInput:: Int -> 
genInput n  = do let nrClientes      = n
                 let nrProprietarios = 1000
                 nifs               <- genNifs [] (nrClientes + nrProprietarios) 
                 clientes           <- genClientes (take nrClientes nifs)
                 proprietarios      <- genProprietarios (drop nrClientes nifs)
                 carros             <- genCarros (drop nrClientes nifs)
                 matriculas         <- getMatriculas carros
                 alugers            <- genAlugers (take (nrClientes*0.4) nifs)
                 classificacoes     <- genClassificacoes (take (nrClientes*0.4) nifs) (take 600 matriculas) 
                 print(clientes)
                 print(proprietarios)
                 print(carros)
                 print(alugers)
                 print(classificacoes) 
                 return ( clientes)    
             --  resultWritter clientes proprietarios carros alugers classificacoes






{-

--tem de se forçar a usar String por ter o isSubsequemceOf
myrem:: String -> [String] -> [String]

myrem x [] = []
myrem x (y:ys) | isSubsequenceOf x y = ys
               | otherwise = y : myrem x ys


genCarro :: [NIF] -> Gen [Carro]
genCarro nifs = 
    do n         <- elements nifs
       let nifs' = delete n nifs
       cs        <- genCarro nifs'
       tipo      <- genTipo
       marca     <- genMarca
       matricula <- genMatricula
       cpkm      <- genCPKm
       autonomia <- genAutonomia
       let car   = Carro tipo marca matricula n cpkm autonomia
       return (car : cs)
  -}











