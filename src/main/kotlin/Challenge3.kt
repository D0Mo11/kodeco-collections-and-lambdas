//Function that sums up elements and return the sum

fun sum(integerList: List<Int>): Int {
    var result = 0
    for (integer in integerList) {
        result += integer
    }
    return result
}

fun main() {
    val integerList = listOf(2, 4, 5, 8, 10)
    println("Sum: ${sum(integerList)}")
}