

object Tuples {
  //tuple contains 1 to 22 different data types, tuple is immutable
  val t1=(1,2,"hi",true,1.1f)
  val t2=new Tuple3(3,"cyan",false) //3 -> 3 elements in tuple
  val t3=new Tuple2(4,"gem") //2 -> 2 elements in tuple
   //nested tutples
  val t4=new Tuple3(6,true,(2,-1))
  
  def main(args: Array[String]): Unit = {
    println(t1)          //(1,2,hi,true,1.1)
    println(t1.getClass) //scala.Tuple5 5-> 5 elements
    //_1, _2, ... _5 to get value from 5 indexes
    println(t1._5)        //1.1 
    t1.productIterator.foreach{
      x=>print(x+", ")
    }
    println()
    for(x<-t1.productIterator){
      print(x+", ")
    }
    println()
    //nested tutples
    println(1->true)        //(1,true)
    println(1->true->"hi")  //((1,true),hi)
    println("------------------")
    println(t4._3)      //(2,-1)
    println(t4._3._2)    //-1
  }
}