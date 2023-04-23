fun main(){
    var car=Car()
    car.run()

    var rectangle=Rectangle(45.2,23.9)
    println(rectangle.area())

    var person=Person("Sammy",33)
    println(person.name)
    var employee=Employee("Doctor", person)
    employee.work()


    var user=User("Bruno","IsToLate24")
    var isValidate=user.validatePassword()
    println("$isValidate")
//    println(user.validatePassword())
    println(user.password)

    val point1 = Point(3.0, 4.0)
    val point2 = Point(0.0, 0.0)
    val distance = point1.distance(point2)
    println("$distance")



}
//Create an interface called Runnable with a method called run. Create a class called
//Car that implements Runnable and overrides the run method to print "The car is running."
interface Runnable{
    fun run()
}
class Car(){
    fun run(){
        println("The car is running")
    }
}

//Create an abstract class called Shape with an abstract method called area.
//Create a subclass called Rectangle that implements area using the formula width * height.

abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}
//Create a data class called Employee that extends Person and adds a property for position.
//Write a method called work that prints "I am a {position}."

open class Person(var name:String,var age:Int)

data class Employee(var position:String,var person:Person):Person(person.name, person.age){

    fun work(){
        println("I am a ${position}")

    }
}

//Create a data class called User with properties for username and password.
//Write a method called validatePassword that checks if the password
//contains at least one uppercase letter, one lowercase letter, and one number.
data class User(var username:String,var password:String){
    fun validatePassword(){
        var hasUpperCase=password.any{it.isUpperCase() }
        var hasLowerCase=password.any { it.isLowerCase() }
        var hasLetter=password.any { it.isLetter() }

    }
}

//Create a data class called Point with properties for x and y.
//Write a method called distance that takes another Point as an argument and
//returns the Euclidean distance between the two points.
data class Point(var x:Double,var y:Double){
    fun distance(another: Point):Double{
        var dx=x-another.x
        var dy=y-another.y

        return Math.sqrt (dx*dx + dy*dy)

    }

}





















