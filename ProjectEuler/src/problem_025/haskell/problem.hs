import System.Environment
import Debug.Trace

fib :: Integer -> Integer
fib 0 = 0
fib 1 = 1
fib n = fib(n-1) + fib(n-2)

findNum :: [Integer] -> Integer -> Integer
findNum (x:xs) z = if((length(show x)) > 999)
	then z
	else trace ("x:" ++ (show x)) (findNum xs (z+1))
main :: IO()
main = do
	args <- getArgs
	let x = read (head(args)) :: Integer
	let fibs = 0:1:zipWith(+) fibs (tail fibs)
	let r = findNum fibs 0
	print r
