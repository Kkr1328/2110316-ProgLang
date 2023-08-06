package package1

object Question01 {
  def insertATPosition(x:Any, pos: Int, l:List[Any]) : List[Any] = {
    if(pos < 0 || pos > l.length) return l;
    else if(pos != 0) return l.head :: insertATPosition(x, pos-1, l.tail);
    else return x :: l;
  }

  def main(args: Array[String]){
    val myList = List(1, 2, 3, 4, 5)
    println(insertATPosition(999, -1, myList))
    println(insertATPosition(999, 0, myList))
    println(insertATPosition(999, 1, myList))
    println(insertATPosition(999, 2, myList))
    println(insertATPosition(999, 3, myList))
    println(insertATPosition(999, 4, myList))
    println(insertATPosition(999, 5, myList))
    println(insertATPosition(999, 6, myList))
  }
}
