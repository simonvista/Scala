package AbstractClass

object Driver {

  def main(args: Array[String]): Unit = {

    var rec = new Rectangle(1.1, 0.9)
    printArea(rec)
    var tri = new Triangle(1.1, 0.9)
    printArea(tri)
  }
  def printArea(p: Polygon) {
    println(p.area1)
  }
}