
// determine if a string is a palindrome

val input = "racecar"
val input2 = "racecars"

def revList[A](l: List[A]): List[A] = {
    l match {
        case Nil => Nil
        case head :: tail => revList(tail) ::: List(head)
    }
}

def isPalindrome(s: String): Boolean = s == revList(s.toList).mkString

val result = isPalindrome(input)
println(s"Input palindrome? $result")

val result2 = isPalindrome(input2)
println(s"Input2 palindrome? $result2")



