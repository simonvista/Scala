//class is a blue print of object
//var -> gettter setter, val -> getter --
//default -> -- --
class User
class User1(private var name: String, var age: Int) {
  def getName() = println(name)
  def setName(name: String) = this.name = name
}

//pbj can't be instantiated
object Classes {

  def main(args: Array[String]): Unit = {
    //create instance of class
    var user = new User
    var user1 = new User1("Mike", 12)
    //user1.name="Amy"
    user1.setName("Bob")
    user1.age = 13
    user1.getName()
    //println(user1.name+", "+user1.age)
  }
}