
// find the number of elements in a list

val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def getLength[A](l: List[A]): Int = {
    def findLength(n: Int, l: List[A]): Int = {
        l match {
            case head :: Nil => n + 1
            case head :: tail => findLength(n+1, tail)
            case _ => throw new NoSuchElementException
        }
    }
    findLength(0, l)
}

val result = getLength(nums)
println(s"Number elements: $result")


