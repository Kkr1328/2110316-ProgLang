package package1

object Question05 {
  def merge(l1: List[Int], l2: List[Int]): List[Int] ={
    if(l1.isEmpty){
      return l2;
    }else if(l2.isEmpty){
      return l1;
    } else {
      if (l1.head < l2.head){
        return l1.head :: merge(l1.tail, l2);
      } else {
        return l2.head :: merge(l1, l2.tail);
      }
    }
  }

  def getFront(l: List[Int], len : Int): List[Int] = {
    if(len == 0){
      return Nil
    } else {
      return l.head :: getFront(l.tail, len-1);
    }
  }

  def getBack(l: List[Int], len : Int): List[Int] = {
    if(len == 0){
      return l
    } else {
      return getBack(l.tail, len-1);
    }
  }

  def mergesort(list: List[Int]):List[Int] ={
    if(list.isEmpty || list.length == 1){
      return list
    } else {
      val halfFront = mergesort(getFront(list, list.length/2))
      val halfBack = mergesort(getBack(list, list.length/2))
      return merge(halfFront, halfBack);
    }
  }

  def main(args : Array[String]): Unit ={
    val myList0 = List(1, 4, 76, 2, 3, 456, 457, 354, 26, 2, 34, 7,6, 1, 10, 99);
    val myList1 = List(9, 8, 7, 6, 5, 4, 3, 2, 1)
    println(mergesort(myList0));
    println(mergesort(myList1));
  }
}
