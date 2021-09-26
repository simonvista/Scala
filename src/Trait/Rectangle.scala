package Trait

//Shape is a trait (interface)
class Rectangle(var width:Double,var height:Double) extends Polygon with Shape {
  
  override def area1:Double=width*height
  def color:String="cyan"
}