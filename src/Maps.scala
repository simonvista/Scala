

object Maps {
  //map is immutable by default, can be mutable if declared
  //map key is unique
  //map key links value by ->
  val m1: Map[Int, String] = Map(1 -> "Max", 2 -> "Amy", 3 -> "Tom")
  val m2: Map[Int, String] = Map(5 -> "Jane", 6 -> "Bob", 7 -> "Bill")

  def main(args: Array[String]): Unit = {
    println(m1) //Map(1 -> Max, 2 -> Amy, 3 -> Tom)
    println(m1(3)) //Tom
    println(m1.keys) //Set(1, 2, 3)
    println(m1.values) //MapLike.DefaultValuesIterable(Max, Amy, Tom)
    println(m1.isEmpty)
    for ((k, v) <- m1) {
      println(k + ", " + v)
    }
    // arrow function =>
    m1.keys.foreach {
      k => print(k + ", ")
    }
    //check if key is in map
    println("\n" + m1.contains(3))
    //map concatenation
    println(m1 ++ m2) //Map(5 -> Jane, 1 -> Max, 6 -> Bob, 2 -> Amy, 7 -> Bill, 3 -> Tom)
    println(m1.++(m2)) //Map(5 -> Jane, 1 -> Max, 6 -> Bob, 2 -> Amy, 7 -> Bill, 3 -> Tom)
    println(m1.size) //3
  }
}