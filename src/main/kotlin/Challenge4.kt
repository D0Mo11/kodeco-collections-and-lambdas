//map of animal names and breed

fun main() {
    val animalMap = mutableMapOf(
        "Rabbit" to "Moki",
        "Parrot" to "Kiko",
        "Dog" to "Max",
    )

    animalMap["Dog"] = "Rex"
    animalMap.remove("Max")

    for ((key, value) in  animalMap){
        println("Animals I had: $key $value")
    }
}