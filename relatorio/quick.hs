import Test.QuickCheck
import Data.List

--NovoProp: nome, nif, email,morada
--NovoCliente:nome,nif,email,morada,X,Y
     -- X e Y : posicçao onde se encontra
--NovoCarro:tipo,marca,matricula,nif,velocidade media,preço por km, consumo por km, autonomia, X, Y
     -- X e Y : posicçao onde se encontra
--Aluguer: nif cliente, X destino, Y destino, tipoCombustivel , preferencia
--Classificar: matricula ou nif (cliente ou prop) , nota (0-100)

data NovoProprietario = Nome NIF Email Morada
                      deriving Show
data Cliente          = Nome NIF Email Morada X Y --X e Y são coordenadas
                      deriving Show
data NovoCarro        = Tipo Marca Matricula NIF VelocidadeMedia PrecoKm Consumo Autonomia X Y
                      deriving Show
data Aluger           = NIF Cliente X Y Tipo Preferencia
                      deriving Show
data Classificar      = Matricula Nota 
                      | NIF Nota
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
type VelocidadeMedia = String
type PrecoKm         = Float            --Consumo/Kilometro
type Consumo         = Float
type Autonomia       = Int
type Preferencia     = String


minNifs = 111111111
maxNifs = 999999999
proprios = ["João", "Joana", "Manuel"]
vogais = ["a","e","i","o","u"]
consoantes = ["b","c","d","f","g","h","j","l","m","n","o","p","q","r","s","t","v","x","z"]



nifs = ["911111111","911111112"]
letters = ["AA","AB","AC","AD"]
numbers = ["00","01","02","03","04","05","06","07","08","09"]


genNifs::[NIF] -> Int -> Gen [NIF]

genNifs [] _ = do x <- choose (minNifs,maxNifs) 
                  genNifs [x] 
genNifs xs 0  = return xs
genNifs xs n = do x <- choose (minNifs,maxNifs)
                  if elem x xs then genNifs xs n else genNifs (x:xs) (n-1)


genAplido:: [String] -> [String] -> String -> Int -> Gen String

genAplido xs ys r 0 = return r
genAplido xs ys r n = do x <- elements xs
                         y <- elements ys
                         genAplido xs ys (r ++ y ++ x) (n-2)

genProprios::Gen String
genProprios = elements proprios

genNomes:: Int -> [String] -> Gen [String]

genNomes 0 xs = return xs
genNomes n xs = do x <- genProprio proprios
                   n <- elements [5,7,9]
                   first <- elements consoantes
                   y <- genAplido vogais consoantes (toUpper first)





-- genInput   = nifs <- genNifs [] 












{-
genTipo:: Gen Tipo
genTipo  = frequency [(70,return Combustão),(25,return Hibrido),(5,return Eletrico)]

genCPKm:: Gen Float
genCPKm = choose (0.1,2)

genAutonomia:: Gen Int
genAutonomia = choose (300,400)

genMarca:: Gen String
genMarca = elements [ "Opel", "Porsche"]

genMatricula:: Gen [Char]
genMatricula = do a <- elements letters
                  b <- elements numbers 
                  c <- elements numbers
                  return (a ++ "-" ++ b ++ "-" ++ c)

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
  











