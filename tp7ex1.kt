fun String.containsSubstring(substring: String) : Boolean {
    return this.contains(substring)
}
fun main(){
    val text1 = "Hello"
    val text2 = "World"
    println(text1.containsSubstring("Hello"))
    println(text2.containsSubstring("tout"))
}