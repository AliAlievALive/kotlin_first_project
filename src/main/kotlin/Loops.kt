fun main() {
    val items = listOf("apple", "banana", "orange") //List.of() Java 9
//    mutableListOf("apple", "banana", "orange") // ArrayList
    for (item in items) {
        println(item)
    }

    // while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    // Диапазоны (как в Python)
    println(5 in 3..10)

    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 0..100 step 10) {
        println(i)
    }
}