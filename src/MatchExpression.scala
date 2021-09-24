

object MatchExpression {
  def main(args: Array[String]): Unit = {
    val age = 181
    age match {
      case 20 => println(age)
      case 18 => println(age)
      case 16 => println(age)
      case 14 => println(age)
      case 12 => println(age)
      case _  => println("Invalid age")
    }
    println("------------")
    var str = "33"
    str match {
      case "20" => println(str)
      case "18" => println(str)
      case "16" => println(str)
      case "14" => println(str)
      case "12" => println(str)
      case _    => println("Invalid string")
    }
    println("------------")
    str = "33"
    val res = str match {
      case "20" => str
      case "18" => str
      case "16" => str
      case "14" => str
      case "12" => str
      case _    => "Invalid string"
    }
    println(res)
    println("------------")
    val i = 21
    i match {
      case 1 | 3 | 5 | 7 | 9 => println("odd")
      case 2 | 4 | 6 | 8 | 0 => println("even")
      case _                 => println("Invalid string")
    }
  }
}