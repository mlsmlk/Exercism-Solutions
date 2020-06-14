class Series( val input : String) {
	init {
	     input.forEach { require(it.isDigit()){throw IllegalArgumentException()} }
	    }

    fun getLargestProduct(span: Int): Long {
		if(span == 0) return 1
		require(span > 0 && input.isNotEmpty() && span !=null && span <= input.length) {throw IllegalArgumentException()}
        var result = 1
		var max = 0
		for(i in 0 ..input.length-span){
			for(j in i..i+span-1){
				result *=  Character.getNumericValue(input.get(j))
			}
			max = maxOf(result, max)
			result = 1
		}
		return max.toLong()
    }
}
