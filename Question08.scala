package package1

object Question08 {
  def compare(l1:List[Int], l2:List[Int]) :List[Int] = {
    if(l1.isEmpty) return l2;
    else if(l2.isEmpty) return l1;
    else{
      if(l1.head > l2.head){
        return l1.head :: compare(l1.tail, l2.tail);
      } else {
        return l2.head :: compare(l1.tail, l2.tail);
      }
    }
  }

  def maxAll(lists:List[List[Int]]) :List[Int] = {
    if(lists.isEmpty){
      return Nil
    } else if(lists.length == 1){
      return lists.head
    } else {
      return compare(lists.head, maxAll(lists.tail));
    }
  }

  def main(args:Array[String]): Unit = {
    println(maxAll(List()))
    println(maxAll(List(List())))
    println(maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11))))
    println(maxAll(List(List(3,4),List(1,2,3,4,51,61),List(1,2,31,41,61,51))))
    println(maxAll(List(List(1,2,3,40,5,6),List(10,2,30,4),List(1,200),List(0,0,0,0,0,0,0,0,9))))
  }
}
