

object Function {
  /**
   * @author YL
   */
  object Math {
    def addTwo(x: Int, y: Int) = x + y
    def subtractTwo(x: Int, y: Int) = x - y
    def multiplyTwo(x: Int, y: Int) = x * y
    def divideTwo(x: Int, y: Int) = x / y
    def square(x: Int) = x * x
  }

  def main(args: Array[String]): Unit = {
    println(Math.addTwo(11, -22))
    println(Math.subtractTwo(11, -32))
    println(Math.multiplyTwo(-11, -11))
    println(Math.divideTwo(21, 9))
    //println(Math square -3) b/c square has only one argument
    println(Math.square(-3))
  }
}