package AbstractClass

class Triangle(var base:Double,var height:Double) extends Polygon {
  override def area1:Double=base*height/2
}