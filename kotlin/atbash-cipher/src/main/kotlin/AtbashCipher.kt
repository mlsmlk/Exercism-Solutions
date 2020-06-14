object Atbash {

    fun encode(s: String): String{
     	var temp = s.filter { it.isLetterOrDigit() }
                    .map { if (it.isLetter()) 'a' + ('z' - it.toLowerCase()) else it}
                    .joinToString("")
         return temp.chunked(5).joinToString(" ")           
	}

    fun decode(s: String): String{
     	var temp = s.filter { it.isLetterOrDigit() }
                        .map { if (it.isLetter()) 'a' + ('z' - it.toLowerCase()) else it}
                        .joinToString("")
        return temp
        
    }
}
