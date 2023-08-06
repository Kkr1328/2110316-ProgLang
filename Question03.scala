package package1

object Question03 {
  def isMember(x:Any, l:List[Any]):Boolean = {
    if(l.isEmpty){
      return false
    } else if(x == l.head){
      return true;
    } else {
      return isMember(x, l.tail);
    }
  }

  def subList(l1:List[Any], l2:List[Any]):Boolean ={
    if(l1.isEmpty){
      return true;
    } else if(!isMember(l1.head, l2)) {
      return false;
    } else {
      return subList(l1.tail, l2);
    }
  }

  def main(args: Array[String]): Unit ={
    val myList0 = List(1)
    val myList1 = List(1, 1, 1, 3, 5)
    val myList2 = List(1, 2, 3, 4, 5)
    val myList3 = List(1, 1, 3, 5, 7)
    println("l0 is subset of l1 : " + subList(myList0, myList1))
    println("l1 is subset of l0 : " + subList(myList1, myList0))
    println("l1 is subset of l2 : " + subList(myList1, myList2))
    println("l2 is subset of l1 : " + subList(myList2, myList1))
    println("l1 is subset of l3 : " + subList(myList1, myList3))
    println("l3 is subset of l1 : " + subList(myList3, myList1))
    println("l2 is subset of l3 : " + subList(myList2, myList3))
    println("l3 is subset of l2 : " + subList(myList3, myList2))
  }
}
