fun main() {
    println(testSimple(3, 100))
    println(testString(10))

    println(testNamedArguments(y = 4, z = 2, x = 5))

    testDefaultArguments()
    testDefaultArguments(y = 1)
    testDefaultArguments(3, 5)

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 12)
    println("printEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 6, 7, 8, 4)
}

//fun testSimple(): Int {
//    return 5 + 5
//}

fun testSimple(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

// TODO Kotlin Koans

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase() else name) + number
}

// vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}