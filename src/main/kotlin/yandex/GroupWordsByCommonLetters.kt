package yandex

fun main() {
    println(groupByWords(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}

fun groupByWords(words: Array<String>): List<List<String>> {
    val res: MutableList<List<String>> = mutableListOf()

    val map = mutableMapOf<String, MutableList<String>>()

    words.forEach { word ->
        run {
            val sortedWord = word.toCharArray().sorted().joinToString("")
            if (map.contains(sortedWord))
                map[sortedWord]?.add(word)
            else
                map[sortedWord] = mutableListOf(word)
        }
    }

    map.forEach { (_, value) -> res.add(value) }
    return res
}