fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

// Switch - Case
fun testWhen(input: Any) {
    when (input) {
        1 -> println("Edinica")
        2 -> println("Dvoika")
        in 10..20 -> println("Ot 10 do 20")
        is String -> println("Was input string ${input.length}")
        else -> println("Something else")
    }
}
