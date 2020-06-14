fun transcribeToRna(dna: String): String {
	if(dna == "") return ""
    var list : String = ""
    for (i in 0..dna.length-1){
        when(dna.get(i)) {
            'A' -> list.add("U")
            'T' -> list.add("A")
            'G' -> list.add("C")
            'C' -> list.add("G")
        }       
    }
    return list.toString()
} 
