import Array._

object Array1 {
  val arr: Array[Int] = new Array[Int](4);
  val arr1 = new Array[Int](5); //0 0 0 0 0
  val arr2 = new Array[String](5); //null null null null
  val arr3 = new Array[Double](5); //0.0 0.0 0.0 0.0 0.0
  val arr4 = new Array[Boolean](5); //false false false false false
  var arr5 = Array(1, 2, 3, 4, 5)
  def main(args: Array[String]): Unit = {
    arr(0) = 20
    arr(1) = 50
    arr(2) = 10
    arr(3) = 20
    for (x <- arr) {
      print(x + ", ")
    }
    println()
    for (x <- 0 until arr.length) {
      print(arr(x) + ", ")
    }
    println()
    for (x <- 0 to arr.length - 1) {
      print(arr(x) + ", ")
    }
    println()
    for (x <- arr1) {
      print(x + ", ")
    }
    println()
    for (x <- arr2) {
      print(x + ", ")
    }
    println()
    for (x <- arr3) {
      print(x + ", ")
    }
    println()
    for (x <- arr4) {
      print(x + ", ")
    }
    println("\n" + arr5.length)
    val arr6 = concat(arr, arr5)
    for (x <- arr6) {
      print(x + ", ")
    }

  }
}