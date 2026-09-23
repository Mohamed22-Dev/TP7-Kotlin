fun main() {
    val utilisateur = mutableMapOf<String, Int>("mohamed" to 1, "amine" to 2, "adam" to 3, "fatima" to 4)
    utilisateur["ahmad"] = 5
    utilisateur["zakaria"] = 6
    val racherche = "mohamed"
    if (utilisateur.containsKey(racherche))
        println("recherche contains ${racherche} ")
    else
        println("racherche doesn't contain ${racherche} ")
    println(utilisateur)
}