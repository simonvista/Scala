//Closure is a function outside which variable(s) declared 

object Closure {
  //add() needs num value declared outside of function
  var num=10
  val add=(x:Int)=>x+num
  val add1=(x:Int)=>{
    num+=x
    num
  }
  
  def main(args: Array[String]): Unit = {
    num=5
    println(add(-5))
    println(add1(-5))
  }
}