//No multiple inheritance in Scala 

package Trait

object Driver {

  def main(args: Array[String]): Unit = {

    var rec = new Rectangle(1.1, 0.9)
    printArea(rec)    
    println(rec.color)
    
    var tri = new Triangle(1.1, 0.9)
    printArea(tri)
    println(tri.color)
    
  }
  def printArea(p: Polygon) {
    println(p.area1)
  }
}