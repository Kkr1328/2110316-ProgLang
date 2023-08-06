package package1

object Question06 {
  def isLessThan3(x:Int): Boolean = x<3

  def myFilter(f:Int => Boolean) (list:List[Int]) :List[Int] = {
    if(list.isEmpty){
      return Nil
    } else if(f(list.head)) {
      return list.head :: myFilter(f)(list.tail);
    } else {
      return myFilter(f)(list.tail);
    }
  }

  def main(args: Array[String]): Unit ={
    val myList = List(1,2,3,4,5);
    println(myFilter(x => x%2 == 0)(myList));
    println(myFilter(isLessThan3)(myList));
  }
}
