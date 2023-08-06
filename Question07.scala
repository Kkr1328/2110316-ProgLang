package package1

object Question07 {
  def square(x: Int) : Int = x*x

  def myMap(f:Int => Int) (list:List[Int]) :List[Int] = {
    if(list.isEmpty){
      return Nil;
    } else {
      return f(list.head) :: myMap(f)(list.tail);
    }
  }

  def main(args:Array[String]): Unit = {
    println(myMap(x => x*2)(List(1,2,3,4,5)))
    println(myMap(square)(List(1,2,3,4,5)))
  }
}
