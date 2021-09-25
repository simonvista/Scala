

object MapFlattenFlattenMapFilter {
  val l1 = List(1, 3, 6, 5, 4)
  val m1 = Map(1 -> "Brian", 2 -> "Tom", 3 -> "Amy")

  def main(args: Array[String]): Unit = {
    //map
    println(l1.map(_ * 2)) //List(2, 6, 12, 10, 8)
    println(l1.map(x => x * 2)) //List(2, 6, 12, 10, 8)
    println(l1.map(x => x / 0.2)) //List(5.0, 15.0, 30.0, 25.0, 20.0)
    println(l1.map(x => x / 2)) //List(0, 1, 3, 2, 2)
    println(l1.map(x => "h" * x)) //List(h, hhh, hhhhhh, hhhhh, hhhh)
    println(m1.map(x => "Hi " + x)) //List(Hi (1,Brian), Hi (2,Tom), Hi (3,Amy))
    println(m1.map(x => "Hi " + x._2)) //List(Hi Brian, Hi Tom, Hi Amy)
    println(m1.mapValues(x => "Hi " + x)) //Map(1 -> Hi Brian, 2 -> Hi Tom, 3 -> Hi Amy)
    println("hello".toUpperCase()) //HELLO
    println("hello".map(_.toUpper)) //HELLO

    //flatten, flatMap
    var ll1 = List(List(1, 2, 3), List(3, 4, 5))
    println(ll1) //List(List(1, 2, 3), List(3, 4, 5))
    println(ll1.flatten) //List(1, 2, 3, 3, 4, 5)
    println(l1.flatMap(x => List(x, x + 1))) //List(1, 2, 3, 4, 6, 7, 5, 6, 4, 5)
    println(l1.map(x => List(x, x + 1))) //List(List(1, 2), List(3, 4), List(6, 7), List(5, 6), List(4, 5))

    //filter
    println(l1.filter(x => x % 2 == 0)) //List(6, 4)
    println(l1.filter(x => x % 2 == 1)) //List(1, 3, 5)

  }
}