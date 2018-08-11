
// reverse a list

val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

def revList[A](l: List[A]): List[A] = {
    l match {
        case Nil => Nil
        case head :: tail => revList(tail) ::: List(head)
    }
}

val result = revList(nums)
println(s"Reversed list: $result")


