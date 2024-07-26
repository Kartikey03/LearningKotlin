class MyClass {
    fun greet(name: String) {
        var name:String="Alina"
        println("Alice is now changed to $name")
    }
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}

fun main() {
    println("The name passed to the function is Alice")
    val myObject = MyClass() // Creating an instance of MyClass
    myObject.greet("Alice") // Calling the greet function

    val sum = myObject.add(3, 5) // Calling the add function
    println("Sum: $sum")
}
