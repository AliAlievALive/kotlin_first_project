package yandex

fun main() {
    val arr1 = intArrayOf(1, 2, 3, 2, 0, 2, 2, 2)
    val arr2 = intArrayOf(5, 1, 2, 7, 3, 2)

    println(getRepeatedIntersection(arr1, arr2))
}

fun getRepeatedIntersection(arr1: IntArray, arr2: IntArray): List<Int> {
    val s1 = arr1.toHashSet() // Неповторяющиеся элементы
    val s2 = arr2.toHashSet() // Неповторяющиеся элементы

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) { // Если во втором Сэте есть такой элемент
            val numOfRepeats = minOf(arr1.count { it == el }, arr2.count { it == el }) // то вытаскиваем из 2 массивов
                                                                    // минимальное количество повторения этого элемента

            repeat(numOfRepeats) { result.add(el) } // А в результат складываем этот элемент столько раз,
                                                    // сколько положили в numOfRepeats
        }
    }

    return result
}