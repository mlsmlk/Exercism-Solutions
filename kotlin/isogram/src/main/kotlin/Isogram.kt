object Isogram {

    fun isIsogram(input: String): Boolean {
       var temp =  input.toLowerCase().filter{it.isLetter()}
		if(temp.toSet().size == temp.length) return true
		return false
    }
}
