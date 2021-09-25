

object ForLoop {
  def main(args: Array[String]): Unit = {
    //<- is forEach()
    for (a <- 1 to 5) {
      print(s"$a, ")
    }
    println("\n-------------------")
    for (a <- 1.to(5)) {
      print(s"$a, ")
    }
    println("\n-------------------")
    for (a <- 1.until(5)) {
      print(s"$a, ")
    }
    println("\n-------------------")
    for (a <- 1 until 5) {
      print(s"$a, ")
    }
    println("\n-------------------")
    //nested for loop
    for (i <- 1 to 9; j <- 1 to 3) {
      println(s"$i - $j")
    }
    println("-------------------")
    val l1 = List(1, 2, 3, 4, 5);
    for (i <- l1) {
      print(s"$i, ")
    }
    println("\n-------------------")
    for (i <- l1; if i < 3) {
      print(s"$i, ")
    }
    println("\n--------for loop as expression-----------")
    //for loop as expression
    val res = for { i <- l1; if i < 3 } yield {
      i * i
    }
    println(res)
    println("\n--------for loop as expression-----------")
    //for loop as expression
    val res1 = for {
      i <- l1
      if i < 3
    } yield {
      i * i
    }
    println(res1)
    //4
  }
}
