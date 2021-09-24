

object WhileDoWhile {
  def main(args: Array[String]): Unit = {
    var x=0
    while (x<10) {
      print(s"$x, ")
      x+=1  //++, -- are NOT valid in scala
    }
    println("\n------------------------------")
    do{
      print(s"$x, ")
      x-=1  //++, -- are NOT valid in scala
    }while(x>0)
  }
}