//last challenge

fun main() {
    val appRatings = mapOf(
        "Calendar Pro" to arrayListOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayListOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayListOf(2, 1, 2, 2, 1, 2, 4, 2),
    )

    val averageRatings = appRatings.map { it.key to it.value.average() }.toMap()
    val topApps = averageRatings.filter { it.value > 3 }
    println(averageRatings)
    println(topApps)
}