fun main() {
    var a: String = "Hello"
//    a = null //NPE исключен

    println(a.length)
    var b: String? = "Test"
    b = null
//    println(b.length)

    // Вернет длину b, если null -> null (никаких NPE!)
    println(b?.length)

    //bob?.department?.head?.name -> null

    // Elvis operator - ?:
    val l = b?.length ?: -1
    println(l)

    b = if ((0..10).random() > 5) "asds" else null
    //!! - выбрасывает NPE если в переменной null
    val t = b!!.length
}