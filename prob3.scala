
// get a specified element from a list

val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def getElement[A](n: Int, l: List[A]): A = {
    (n, l) match {
        case (0, k :: _) => k
        case (n, head :: tail) => getElement(n-1, tail)
        case (_, _) => throw new NoSuchElementException
    }
}

val num = 4
val result = getElement(num, nums)
println(s"Getting ${num}th element: $result")


