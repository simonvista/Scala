

object Sets {
  //set is a collection w/same data type and distinct elements
  //set is immutable by default or mutable if declared
  //immutable set by default. Set is not ordered
  val l1: Set[Int] = Set(1, 2, 3, 4, 5, 4, 4)
  val n1: Set[String] = Set("a", "b", "c", "c", "a")
  //mutable set -> declare scala.collection.mutable.Set rather than Set
  //var l2:scala.collection.mutable.Set[Int]=scala.collection.mutable.Set(1,2,3,4,5,4,4)
  var l2 = scala.collection.mutable.Set(1, 2, 3, 4, 5, 4, 4)
  val l4: Set[Int] = Set(6, 7, 3, 8, 5, 4, 4)

  def main(args: Array[String]): Unit = {
    println(l1) //Set(5, 1, 2, 3, 4)
    println(n1) //Set(a, b, c)
    var l3 = l1 + 10 //insert 10 at index of 1
    println(l3) //Set(5, 10, 1, 2, 3, 4)
    println(l1) //Set(5, 1, 2, 3, 4) -> l1 is immutable

    //Tests if 5 is contained in this set.
    println(l1(5)) //true
    println(n1("c")) //true
    println(l1.head) //5
    println(l1.tail) //Set(1, 2, 3, 4)
    println(l1.isEmpty)

    //concate sets
    println(l1 ++ l4) //Set(5, 1, 6, 2, 7, 3, 8, 4)
    println(l1.++(l4)) //Set(5, 1, 6, 2, 7, 3, 8, 4)

    //sets intersection
    println(l1 & l4) //Set(5, 3, 4)
    println(l1.&(l4)) //Set(5, 3, 4)
    println(l1.intersect(l4)) //Set(5, 3, 4)

    //max, min of set
    println(s"max: ${l1.max}") //5
    println(s"min: ${l1.min}") //1

    //iterate set
    l1.foreach(println)
    for (x <- l1) {
      print(x + ", ")
    }
  }
}