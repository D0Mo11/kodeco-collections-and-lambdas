//Array of movies

fun main() {
    val moviesArray = arrayOf("Godfather I", "Godfather II", "Fight Club", "Inception", "The Usual Suspect")
    moviesArray[3] = "Dark Knight"
    println("Second movie: ${moviesArray[1]}")

    val moviesList = moviesArray.toMutableList()
    moviesList.addAll(listOf("Scarface", "Snatch"))
    moviesList.remove("Inception")
    println("Final list of movies: $moviesList")
}