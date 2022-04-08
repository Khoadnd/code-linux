module Lib
  ( someFunc,
  )
where

someFunc :: IO ()
someFunc = putStrLn "someFunc"

showDemo :: (t1 -> t2) -> (t3 -> t1) -> t3 -> t2
showDemo a b c = a $ b c
