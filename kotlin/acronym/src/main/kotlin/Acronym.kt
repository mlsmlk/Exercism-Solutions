object Acronym {
    fun generate(phrase: String) : String {
       var p = phrase.replace("_","").replace("- ","").split(" ","-")
       var first = p.map {it.first().toUpperCase()}.joinToString("")
       return first
    }
}
