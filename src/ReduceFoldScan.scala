

object ReduceFoldScan {
  val l1 = List(1, 2, 3, 5, 7, 10, 13)
  val l2 = List("A", "B", "C")
  def main(args: Array[String]): Unit = {
    //reduceLeft | reduceRight
    println(l2.reduceLeft(_ + _)) //ABC
    println(l1.reduceLeft(_ + _)) //41
    println(l1.reduceLeft((a, b) => {
      println(a + ", " + b)
      a - b
    }))
    println(l1.reduceLeft(_ - _)) //-39
    println(l1.reduceRight(_ - _)) //7
    println(l1.reduceRight((a, b) => {
      println(a + ", " + b)
      a - b
    }))
    println("--------------------")
    //foldLeft | foldRight -> w/ initial argument
    println(l1.foldLeft(0)(_ - _)) //-41
    println(l1.reduceLeft(_ - _)) //-39
    println(l1.foldLeft(0)((a, b) => {
      println(a + ", " + b)
      a - b
    }))
    println("--------------------")
    //scanleft | scanRight -> provide intermediate values
    println(l1.scanLeft(0)(_ - _)) //List(0, -1, -3, -6, -11, -18, -28, -41)
  }
}