fun main() {
    val fruit = mutableListOf<String>("orange", "pomme")
    fruit.removeAt(0)
    fruit.add("fraize")
    val recherche = "pomme"
    if (recherche.contains("orange"))
        println("recherche et corecte $recherche")
    else
        println("recherche et incorecte $recherche")
    println(fruit)
}