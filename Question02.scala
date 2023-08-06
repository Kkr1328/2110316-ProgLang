package package1

object Question02 {
  def insertInOrder(x:Int, list:List[Int]):List[Int] = {
    if(list.isEmpty) return x :: Nil;
    else if(x < list.head) return x :: list;
    else return list.head :: insertInOrder(x, list.tail);
  }

  def main(args: Array[String]): Unit ={
    val myList = List(10, 20, 30, 40, 50)
    println(insertInOrder(5, myList))
    println(insertInOrder(15, myList))
    println(insertInOrder(25, myList))
    println(insertInOrder(35, myList))
    println(insertInOrder(45, myList))
    println(insertInOrder(55, myList))
    val emList = List();
    println(insertInOrder(5, emList))
  }
}
