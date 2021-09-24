import java.util.Date

object PartialAppliedFunction {
  def log(date:Date,msg:String)=println(date+", "+msg)
  
  def main(args: Array[String]): Unit = {
    //fully applied function -> applying all arguments to function
    val sumThree = (a: Int, b: Int, c: Int) => a + b + c
    println(sumThree(10, 20, 30))

    //partial applied function
    val f = sumThree(10, 20, _: Int)
    println(f(30))
    //partial applied function
    val f1 = sumThree(10, _: Int, _: Int)
    println(f1(20, 30))
    
    val date=new Date
    //partial applied function
    val newLog=log(date,_:String)
    newLog("Hi")

  }
}