package Trait

class Triangle(var base:Double,var height:Double) extends Polygon with Shape {
  override def area1:Double=base*height/2
  def color:String="orange"
}