package Inheritance

class Rectangle(var width:Double,var height:Double) extends Polygon {
  
  override def area1:Double=width*height
}