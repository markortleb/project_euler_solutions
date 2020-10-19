package projecteuler4

import scala.util.Try

object ProjectEuler4 {

    def main(args: Array[String]) {
        getMaxPalindrome()
    }

    def getMaxPalindrome(){
        val digits: Int = 3

        val lowerBound: Int = ("1" + List.fill(digits - 1)("0").mkString).toInt
        val upperBound: Int = (List.fill(digits)("9").mkString).toInt
        
        val range: List[Int] = List.range(lowerBound, upperBound + 1)
        
        var maxPalindrome = 0

        for (i <- range){
            for (j <- range){
                var product: Int = i * j
                if (isPalindrome(product) && product > maxPalindrome){
                    maxPalindrome = product
                }
            }
        }

        println(maxPalindrome)

    }


    def isPalindrome(n: Int) : Boolean = {
        val nString: String = n.toString
        var isPalindrome: Boolean = false
        if (nString == nString.reverse){
            isPalindrome = true
        }

        return isPalindrome
    }


}