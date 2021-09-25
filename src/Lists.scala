

object Lists {
  //list is immutable, array is mutable
  //list is linkList, array is flat list
  val l1: List[Int] = List(1, 2, 3, 4, 5);
  val names: List[String] = List("Max", "Tom", "John")

  def main(args: Array[String]): Unit = {
    //we can not run l1(0)=5 ->list is immutable
    println(l1)
    println(names)
    //Adds an element at the beginning of this list -> ::
    var l2 = 0 :: l1
    println(l2)
    println(Nil) //List()
    l2 = 1 :: 5 :: 9 :: Nil
    println(l2) //List(1, 5, 9)
    //find 1st element of list
    println(l2.head) //1
    //find all element of list except first
    println(l2.tail) //List(5, 9)
    //check empty
    println(l2.isEmpty)
    //reverse list
    println(l2.reverse) //List(9, 5, 1)
    println(List.fill(5)(2)) //List(2, 2, 2, 2, 2)
    println(l2.max) //9
    //print list
    l1.foreach(println)
    for (x <- l1) {
      print(x + ", ")
    }

    var sum: Int = 0
    l1.foreach(sum += _)
    println("\nsum=" + sum)

    println(l1(4))
  }

}