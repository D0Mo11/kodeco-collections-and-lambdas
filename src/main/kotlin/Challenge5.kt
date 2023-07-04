//items  on table to set

fun main() {
    val items = listOf("coffee cup", "speakers", "laptop", "cable", "cable", "headphones", "mouse", "mouse" )
    println(items)

    val uniqueItems = items.toMutableSet()
    println(uniqueItems)

    uniqueItems.remove("speakers")
    for (item in uniqueItems){
        println(item)
    }
}