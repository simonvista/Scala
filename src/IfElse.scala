

object IfElse {
  def main(args: Array[String]): Unit = {
    //if else && ||
    val x = 20
    val y=30
    var res = ""
    if (x == 20 && y==30) {
      res = "x==20"
      println(res)
    } else {
      res = "x!=20"
      println(res)
    }
    val res1 = if (x == 20 && y==30) "x==20" else "x!=20"
    println(res1)
    println(if (x == 20 && y==30) "x==20" else "x!=20")
  }
}