//         getter?  setter?
//var      Y        Y
//val      Y        N
//default  N        N
//class User2(private var name: String, age: Int){
//  def getName()=println(name)
//  def printAge()=println(age)
//}
class User2(private var name: String, var age: Int) {
  //default constructor
  def this() {
    this("Amy", 20)
  }
  //constructor w/ one parameter
  def this(name: String) {
    this(name, 20)
  }
}

object AuxiliaryConstructor {

  def main(args: Array[String]): Unit = {
    //    var user=new User2("Jack",23)
    //    user.getName()
    //    user.printAge()
    var user = new User2("Jack", 23)
    var user1 = new User()
    var user2 = new User2("Bob")

  }
}