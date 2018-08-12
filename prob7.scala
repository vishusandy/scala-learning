
// flatten a nested list
// with some help from http://blog.thedigitalcatonline.com/blog/2015/04/07/99-scala-problems-07-flatten/

val nested = List(List(1, 2, 3), 4, List(5, 6, 7, List(8, 9, 10)))

def flatList(l: List[Any]): List[Any] = l match {
    case Nil => Nil
    case (head:List[_]) :: tail => flatList(head) ::: flatList(tail)
    case head :: tail => List(head) ::: flatList(tail)
    // could use the following line instead:
    // case head :: tail => head :: flatList(tail)
    //
    // the difference is:
    // :: takes a list and an element (not in a list) 
    // while ::: takes two lists
}


val result = flatList(nested)
println(s"Flatted list: $result")
