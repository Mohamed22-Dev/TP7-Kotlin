fun main() {
    var entiers = mutableListOf<Int>(2,4,6)
    entiers.add(8)
    var mutable: List<Int> = entiers.toList()
    entiers.sort()
    println(mutable)
    println(entiers)
}