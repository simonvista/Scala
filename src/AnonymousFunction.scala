

object AnonymousFunction {
  object Math {
    def add(x: Int = 2, y: Int = 3) = x + y
    def +(x: Int, y: Int) = x + y
    def **(x: Int) = x * x
  }
  //Unit ->no return
  def myPrint(x: Int, y: Int): Unit = println(x + y)
  def main(args: Array[String]): Unit = {
    println(Math.add()) //5
    println(Math.add(-6)) //-3
    myPrint(4, -7)
    println(Math.+(-6, 2))
    println(Math.**(-9))
    //anonymous function
    var add = (x: Int, y: Int) => x + y
    println(add(1, -9))
  }
}