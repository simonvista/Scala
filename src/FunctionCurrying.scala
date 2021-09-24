//Currying is the technique of transforming a function
//Currying takes argument(s) into a function

object FunctionCurrying {
  def add(x:Int,y:Int)=x+y
  //currying
  def add1(x:Int)=(y:Int)=>x+y
  def add2(x:Int)(y:Int)=x+y
  
  def main(args: Array[String]): Unit = {
    println(add(20,-10))
    println("-----------------")
    println(add1(20)(-10))
    var sum=add1(20)
    println(sum(-10))
    
    println("-----------------")
    println(add2(20)(-10))
    
    println("-----------------")
    sum=add2(20)_ 
    println(sum(-10))
  }
}