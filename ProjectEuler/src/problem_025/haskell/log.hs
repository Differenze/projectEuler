import Debug.Trace
logs :: [Integer] -> Integer
logs (x:xs) = if (x>50)
	then 0
	else trace ("x:" ++ (show x) ++ " --- logx:" ++ (show (logBase 10 (fromIntegral x)))) (logs xs)

main = do
	let x = 10**1000
	print (show x)
