

object LazyEvaluation {
  def m1(n: Int) {
    println("m1")
    println(n)
  }
  //called by name parameter method "=>"
  def m2(n: => Int) {
    println("m1")
    println(n) //n returns value only when it was called
  }

  def main(args: Array[String]): Unit = {
    val add = (a: Int, b: Int) => {
      println("add")
      a + b
    }

    m1(add(5, 6))
    m2(add(5, 6))

  }
}