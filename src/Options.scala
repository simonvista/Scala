

object Options {
  //option -> Some(value) or None
  val l1 = List(1, 2, 3)
  val m1 = Map(1 -> "William", 2 -> "Alex", 3 -> "Brian")
  val o1: Option[Int] = Some(5)
  val o2: Option[Int] = None

  def main(args: Array[String]): Unit = {
    //Finds the first element of the list satisfying a predicate, if any
    println(l1.find(_ > 6)) //None
    println(l1.find(p => p < 4)) //Some(1)
    println(l1.find(_ > 2)) //Some(3)
    println(m1.get(3)) //Some(Brian)
    println(m1.get(4)) //None
    println(l1.find(_ < 4).get) //1
    println(m1.get(3).get) //Brian
    //println(m1.get(31).get)     //throw exception
    println(m1.get(31).getOrElse("No such key exists")) //No such key exists
    println(l1.find(_ < 0).getOrElse(-1)) //-1
    println(l1.find(_ < 3).getOrElse(-1)) //1
    println(o1) //Some(5)
    println(o2) //None
    println(o1.isEmpty) //false
    println(o2.isEmpty) //true
    println(o1.get) //5
    println(o2.getOrElse(-1)) //-1
  }
}