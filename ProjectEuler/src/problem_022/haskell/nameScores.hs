import System.IO
import Data.List.Split
import Data.List

charactervalues = "\"ABCDEFGHIJKLMNOPQRSTUVWXYZ"

valueOfChar :: Char -> Int
valueOfChar x = maybe 0 (*1) (elemIndex x charactervalues)


valueOfWord :: [Char] -> Int
valueOfWord word = sum (map valueOfChar word)


main :: IO()
main = do
	putStrLn "Start:"


--	pull text from file
	inHandler <- openFile "../data/names.txt" ReadMode
	text <- hGetLine inHandler
--	split text into words
	let words = splitOn "," text
--	magic :D
	print (sum (zipWith (*) [1..] (map valueOfWord (sort words))))


	putStrLn "End!"
