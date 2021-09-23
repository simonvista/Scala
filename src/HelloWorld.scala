
//new version
//object HelloWorld extends App {
//  println("Hello World")
//}

//old version
object HelloWorld {
  def main(args: Array[String]): Unit = {
    //s string interpolation | f string interpolation
    val name="mark"
    val age=18
    val height=32.12
    println(s"name: $name, age: $age, height: $height")
    println(f"name: $name%s, age: $age%d, height: $height%f")
    println(s"Hello \nWorld");
    println(raw"Hello \nWorld"); 
    
  }
  
}