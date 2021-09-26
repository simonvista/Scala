//lazy evaluation -> only return value when it was called
class Strict {
  val e = {
    println("Strict")
    9
  }
}
class LazyEval {
  lazy val e = {
    println("LaztEval")
    -1
  }
}

object LazyEvaluation {

  def main(args: Array[String]): Unit = {
    val x = new Strict //Strict
    val y = new LazyEval
    println(x.e) //9
    println(y.e) //LaztEval \n -1
  }
}