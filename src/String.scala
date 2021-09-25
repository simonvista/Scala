

object String {
  val str: String = "Hello world"
  val str1: String = " Max"
  val num = 75
  val num1 = 100.25f

  def main(args: Array[String]): Unit = {
    println(str.length())
    println(str.concat(str1))
    println(str + str1)

    println(num1.getClass())
    printf("(%d, %f, %s)\n", num, num1, str)
    println(s"$num, $num1, $str")
    println("(%d, %f, %s)".format(num, num1, str))

  }
}