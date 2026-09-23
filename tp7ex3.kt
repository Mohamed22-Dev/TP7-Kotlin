fun main(){
    val nombres = mutableListOf<Int>(4,5,6)
    nombres.add(7)
    nombres.add(8)
    nombres.add(9)
    nombres.removeFirst()
    nombres.removeLast()
    nombres.removeAt(2)
    var recherche = 6
    if (nombres.contains(recherche))
        println("recherche et corecte $recherche")
    else
        println("recherche et incorecte $recherche")

    println(nombres)
}
