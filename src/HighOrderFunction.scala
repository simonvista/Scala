//HOF: function ,w/ another function as one of its parameters, returns that function 

object HighOrderFunction {
  def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y);  
  def math1(x:Double,y:Double,z:Double,f:(Double,Double)=>Double):Double=f(f(x,y),z);
  
  def main(args: Array[String]): Unit = {
    //val res=math(50,20,(x,y)=>x max y);
    var res=math(50,20,(x,y)=>x.max(y));
    println(res)
    res=math1(50,20,10,(a,b)=>a min b)
    println(res)
    res=math1(50,20,10,(a,b)=>a * b)
    println(res)
    //wildcard pattern ( _ ) matches any object whatsoever
    res=math1(50,20,10,_ + _)
    println(res)
    res=math1(50,20,10,_ max _)
    println(res)
  }
}