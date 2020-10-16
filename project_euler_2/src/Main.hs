module Main where

import Data.List

getFibNums :: Integer -> Integer
getFibNums 1 = 1
getFibNums 2 = 2
getFibNums n = getFibNums (n-1) + getFibNums(n-2)


main :: IO ()
main = do
    let evenFibNums = [fibNum | x <- [1..36], let fibNum = getFibNums (x), fibNum <= 4000000, fibNum `mod` 2 == 0 ]
    
    let sumEvenFibNums = sum evenFibNums
    print(sumEvenFibNums)
    
