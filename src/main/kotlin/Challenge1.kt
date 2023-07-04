//Bank account information challenge

fun main() {
    val bankAccount = Pair(Triple("4545 5151 3535 2323", 280, "Visa"), 10000)
    val (cardNumber, _, cardType) = bankAccount.first

    println("Bank account info:")
    println("Card number: $cardNumber")
    println("Security code: hidden")
    println("Card Type: $cardType")
    println("Balance: ${bankAccount.second}")
}