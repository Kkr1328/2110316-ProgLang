package package1

object Question10 {

  def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]):Int ={
    if(list.isEmpty) return 0;
    else if(list.length == 1) return list.head;
    else if(list.length == 2) return f1(list.head, list.tail.head);
    else if(list.length == 3) return f2(f1(list.head, list.tail.head), list.tail.tail.head);
    else return alternate(f1, f2, f2(f1(list.head, list.tail.head), list.tail.tail.head) :: list.tail.tail.tail);
  }

  def main(args:Array[String]): Unit = {
    println(alternate(_ + _ , _ - _ ,List()))
    println(alternate(_ + _ , _ - _ ,List(55)))
    println(alternate(_ + _ , _ - _ ,List(1, 2)))
    println(alternate(_ + _ , _ - _ ,List(1, 2, 3)))
    println(alternate(_ + _ , _ - _ ,List(1, 2, 3, 4)))
    println(alternate(_ + _ , _ - _ ,List(1, 2, 3, 4, 5)))
  }
}
