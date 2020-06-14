object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
		if(leftStrand == "" && rightStrand == "") return 0
		if(leftStrand.length != rightStrand.length) return 0
        var distance = 0
		for (i in 0..leftStrand.length-1){
			if(leftStrand.get(i)!=rightStrand.get(i)){
				distance++
			}
		}
		return distance
    }
}
