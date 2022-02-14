fun main() {
    val child = Person("Ali", "Aliev", 1)
    val person = Person("Tom", "Jones", 35, child)
    println(person.firstName)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle2 == rectangle1)

}

// Primary Constructor
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) : this(firstName, lastName, age) {
        children.add(child)
    }

    // no args constructor
    constructor() : this("", "", -1)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 //this.myPole
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}