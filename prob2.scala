
// get second to last element from a list

val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def getSecondLast[A](l: List[A]): A = {
    l match {
        case s :: l :: Nil => s
        case h :: t => getSecondLast(t)
        case _ => throw new NoSuchElementException
    }
}

val result = getSecondLast(nums)
println(s"Second to last element: $result")


