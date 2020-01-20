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

data Resultado        = Res [Cliente] [NovoProprietario] [NovoCarro] [Aluger] [Classificar]
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
proprios = ["João", "Joana", "Manuel", "André", "Belo", "Carlos", "Carolina", "Diogo", "Diolinda", "Helder", "Henrique", "Filipa", "Gonçalo", "Guilherme", "Leonor", "Matilde", "Nuno", "Nuna", "Olga", "Paulo", "Paula", "Rui", "Rafael", "Rita", "Sofia", "Sandra", "Sebastião", "Tiago", "Vitor", "Zulmira"]
freguesias = ["Alhões", "Bustelo", "Gralheira e Ramires","Cinfães","Espadanedo","Ferreiros de Tendais","Fornélos","Moimenta","Nespereira","Oliveira do Douro","Santiago de Piães","São Cristóvão de Nogueira","Souselo","Tarouquela","Tendais","Travanca"]
marcas = ["Abarth","Adria","Aixam","Alfa Romeo","Aston Martin","Audi","Austin","Austin Morris","Benimar","Bentley","Bertone","BMW","Cadillac","Challenger","Chevrolet","Chrysler","Citroen","Corvette" ,"Dacia","Daewoo" ,"Daihatsu" ,"Datsun","Dodge" ,"DS","Ferrari" ,"Fiat" ,"Ford","Hobby" ,"Honda","Hyundai","Isuzu" ,"Jaguar","JDM" ,"Jeep","Kia","Lamborghini" ,"Lancia","Land Rover","Lexus","Ligier","Lincoln","Lotu","Maserati","Maybach","Mazda","Mercedes-Benz" ,"MG","Microcar","MINI"]
letter = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","W","V","X","Y","Z"]
numbers = ["0","1","2","3","4","5","6","7","8","9"]
preferencias = ["Mais Perto","Mais Barato","Partilhado"]

genNifs::[NIF] -> Int -> Gen [NIF]
genNifs [] n = do x <- choose (minNifs,maxNifs) 
                  genNifs [x] (n-1)
genNifs xs 0  = return xs
genNifs xs n = do x <- choose (minNifs,maxNifs)
                  if elem x xs then genNifs xs n else genNifs (x:xs) (n-1)



-- Utilizar o frequency com os aplidos mais comuns em Portugal
genApelido:: Gen String
genApelido = frequency [(944,return "Silva"),(596,return "Santos"),(525,return "Ferreira"),(488,return "Pereira"),(371,return "Oliveira"),(368,return "Costa"),(357,return "Rodrigues"),(323,return "Martins"),(299,return "Jesus"),(295,return "Sousa"),(282,return "Fernandes"),(276,return "Gonçalves"),(257,return "Gomes"),(252,return "Lopes"),(251,return "Marques"),(237,return "Alves"),(227,return "Almeida"),(227,return "Ribeiro"),(209,return "Pinto"),(197,return "Carvalho"),(168,return "Teixeira")]

genProprios::Gen String
genProprios = elements proprios

genNome:: Gen String
genNome = do x <- genProprios
             y <- genApelido
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
genTipo  = frequency [(70,return "Gasolina"),(25,return "Hibrido"),(5,return "Electrico")]

genPrecoKm:: Gen Float
genPrecoKm = choose (0.5,3)

genAutonomia:: Gen Int
genAutonomia = choose (350,500)

genMarca:: Gen String
genMarca = elements marcas

combol:: Int -> [String] -> String
combol 0 (x:xs) = x 
combol n (x:xs) = combol (n-1) xs

letterscombo:: Int -> Int -> [String] -> Gen [String]
letterscombo 26 _ str = return str 
letterscombo x 26 str = letterscombo (x+1) 0 str
letterscombo x y  str = letterscombo x (y+1) (((combol x letter) ++ (combol y letter)) :str)


combon::Int -> [String] -> String
combon 0 (x:xs) = x
combon n (x:xs) = combon (n-1) xs

numberscombo:: Int -> Int -> [String] -> Gen [String]
numberscombo 9  10  ns = return ns
numberscombo n  10  ns = numberscombo (n+1) 0 ns
numberscombo n1 n2 ns = numberscombo n1 (n2+1) (((combon n1 numbers)++(combon n2 numbers)):ns) 


aggregate::Int -> [String] -> [String] -> [String] -> [Matricula] -> Gen [Matricula]
aggregate 0 _ _ _ m = return m
aggregate n (x:xs) (y:ys) (z:zs) m | (x == "99" || x == "ZZ") && (y == "99" || y == "ZZ") && (z == "99" || z == "ZZ") = aggregate (n-1) (ys++[y]) (zs++[z]) (xs++[x]) ((x ++ "-" ++ y ++ "-" ++ z):m)
                                   | (y == "99" || y == "ZZ") && (z == "99" || z == "ZZ") = aggregate (n-1) (xs++[x]) (ys++[y]) (zs++[z]) ((x ++ "-" ++ y ++ "-" ++ z):m)
                                   | (z == "99" || z == "ZZ") = aggregate (n-1) (x:xs) (ys++[y]) (zs++[z]) ((x ++ "-" ++ y ++ "-" ++ z):m)
                                   |otherwise = aggregate (n-1) (x:xs) (y:ys) (zs++[z]) ((x ++ "-" ++ y ++ "-" ++ z):m)

genMatriculas:: Int -> Gen [Matricula]
genMatriculas n = do a     <- letterscombo 0 0 []
                     b     <- numberscombo 0 0 []
                     m     <- aggregate n a a b []
                     return m


genVelocidadeMedia:: Gen VelocidadeMedia
genVelocidadeMedia = choose(50, 150)

genConsumo:: Gen Consumo
genConsumo = choose(3.5,6.5)


-- #################################################################### --
-- #################################################################### --
--                              GEN_CARRO                               --
-- #################################################################### --
-- #################################################################### --

--Novocarro Tipo Marca Matricula NIF VelocidadeMedia PrecoKm Consumo Autonomia X Y

genCarro::NIF -> Matricula -> Gen NovoCarro

genCarro nif mat = do tipo   <- genTipo
                      marca  <- genMarca
                      vel    <- genVelocidadeMedia
                      precKM <- genPrecoKm
                      cons   <- genConsumo
                      aut    <- genAutonomia
                      coordX <- genCoordX
                      coordY <- genCoordY
                      return (Novocarro tipo marca mat nif vel precKM cons aut coordX coordY)

genCarros:: [NIF] -> [Matricula] -> Gen [NovoCarro]
genCarros [] [] = return []
genCarros (x:xs) (y:ys) = do c <- genCarro x y
                             cs <- genCarros xs ys
                             return (c:cs)

getMatriculas::[NovoCarro] ->Gen [String]
getMatriculas [] =return []
getMatriculas ((Novocarro _ _ matricula _ _ _ _ _ _ _):xs) = do let m = matricula
                                                                ms <- getMatriculas xs
                                                                return (m:ms) 

genPreferencia:: Gen Preferencia
genPreferencia  = frequency [(65,return "MaisPerto"),(35,return "MaisBarato")]


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

gen2IOCliente:: [Cliente] -> String

gen2IOCliente [] = []
gen2IOCliente ((NovoCliente nome nif email morada x y):xs) = "NovoCliente:" ++ nome
                                                           ++ "," ++ (show nif) ++ ","
                                                           ++ email ++ "," ++ morada 
                                                           ++ "," ++ (show x) ++ ","
                                                           ++ (show y) ++"\n" ++ gen2IOCliente xs

gen2IOProp:: [NovoProprietario] -> String
gen2IOProp [] = []
gen2IOProp ((NovoProprietario nome nif email morada):xs) = "NovoProp:" ++ nome 
                                                         ++ "," ++ (show nif) ++ ","
                                                         ++ email ++ "," ++ morada ++
                                                         "\n" ++ gen2IOProp xs

gen2IOCarros:: [NovoCarro] -> String
gen2IOCarros [] = []
gen2IOCarros ((Novocarro tipo marca matricula nif velocidadeMedia precoKm consumo autonomia x y):xs) = 
              "NovoCarro:" ++ tipo ++ "," ++ marca ++ "," ++ matricula ++ "," ++ (show nif) 
              ++ "," ++ (show velocidadeMedia) ++ "," ++ (show precoKm) ++ "," ++ (show consumo) ++ ","
              ++ (show autonomia) ++ "," ++ (show x) ++ "," ++ (show y) ++ "\n" ++ gen2IOCarros xs

gen2IOAlugers:: [Aluger] -> String
gen2IOAlugers [] = []
gen2IOAlugers ((Aluger nif x y tipo preferencia):xs) = "Aluguer:" ++ (show nif) ++ "," 
                                                       ++ (show x) ++ "," ++ (show y) 
                                                       ++ "," ++ tipo ++ "," ++ 
                                                       preferencia ++ "\n" ++ gen2IOAlugers xs

gen2IOClassificacoes:: [Classificar] -> String
gen2IOClassificacoes [] = []
gen2IOClassificacoes ((ClassificacaoM matricula nota):xs) = "Classificar:" ++ matricula
                                                          ++ "," ++ (show nota) ++ "\n"
                                                          ++ gen2IOClassificacoes xs
gen2IOClassificacoes ((ClassificacaoN nif nota):xs)       = "Classificar:" ++ (show nif)
                                                          ++ "," ++ (show nota) ++ "\n"
                                                          ++ gen2IOClassificacoes xs

gen2IO:: Resultado -> [String]

gen2IO (Res clientes proprietarios carros alugers classificacoes) = return 
       ((gen2IOCliente clientes) ++ (gen2IOProp proprietarios) 
        ++ (gen2IOCarros carros) ++ (gen2IOAlugers alugers) 
        ++ gen2IOClassificacoes classificacoes) 

genInput:: Int -> Int -> Gen Resultado 
genInput n1 n2 = do let nrClientes      = n1
                    let nrProprietarios = n2
                    nifs               <- genNifs [] (nrClientes + nrProprietarios) 
                    matriculas         <- genMatriculas nrProprietarios
                    clientes           <- genClientes (take nrClientes nifs)
                    proprietarios      <- genProprietarios (drop nrClientes nifs)
                    carros             <- genCarros (drop nrClientes nifs) matriculas
                    matriculas2        <- getMatriculas carros
                    alugers            <- genAlugers (take (nrClientes) nifs)
                    classificacoes     <- genClassificacoes (take (nrClientes) nifs) (take nrProprietarios matriculas2)
                    return (Res clientes proprietarios carros alugers classificacoes)


conc:: [String] -> String
conc [] = []
conc (x:xs) = x ++ conc xs

strGen:: Int -> Int -> IO()
strGen n1 n2 = do res <- generate (genInput n1 n2)
                  let output = gen2IO res
                  let out = conc output
                  writeFile "demo1/db/logsPOO_carregamento5k.bak" out 


