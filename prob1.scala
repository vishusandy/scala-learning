

// get last element from a list

val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def getLast[A](l: List[A]): A = {
    l match {
        case h :: Nil => h
        case h :: t => getLast(t)
        case _ => throw new NoSuchElementException
    }
}

val result = getLast(nums)
println(s"Last element: $result")


