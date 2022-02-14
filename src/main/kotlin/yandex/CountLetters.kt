package yandex

fun main() {
//    AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB -> A4B3C2XYZD4E3F3A6B32
    println(countLetters("AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"))
}

fun countLetters(string: String): String {
    var currentLetter = string[0]
    var count = 1
    var res = ""

    for (letter in string.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1)
                res += currentLetter
            else
                res += "$currentLetter$count"
            count = 1
            currentLetter = letter
        }
    }

    // Обработка последних букв в строке
    if (count == 1)
        res += currentLetter
    else
        res += "$currentLetter$count"

    return res
}