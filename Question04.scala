package package1

object Question04 {
  def reverse(l:List[Any]) : List[Any]={
    if(l.isEmpty){
      return Nil
    } else {
      return reverse(l.tail) ++ (l.head :: Nil);
    }
  }

  def palindrome(list: List[Any]):Boolean ={
    if(list.isEmpty || list.length == 1){
      return true;
    } else {
      if(list.head == reverse(list).head){
        return palindrome(reverse(list.tail).tail);
      } else {
        return false;
      }
    }
  }

  def main(args: Array[String]): Unit ={
    val l1 = List(1, 2, 4, 5, 4, 2, 1)
    val l2 = List(1, 2, 3, 4, 4, 2, 1)
    val l3 = List(List(1, 2), 3, List(1, 2))
    val l4 = List(List(1, 2), 3, List(2, 1))
    println(palindrome(l1))
    println(palindrome(l2))
    println(palindrome(l3))
    println(palindrome(l4))
  }
}
