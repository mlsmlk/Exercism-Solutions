object Luhn {

    fun isValid(candidate: String): Boolean {
    	var str = StringBuilder(candidate.replace(" ", ""))
		if(str.length < 2) return false
		var sum =0
		var temp = 0
		
		
		for(i in str.length-2 downTo 0 step 2){
			temp = (Character.getNumericValue(str.get(i))*2)
			if(temp > 10) temp -= 9
			str.set(i,temp.toString().get(0))
			println("str" + str)
			println(str.get(i))
		}
		for (t in str){
			sum+= Character.getNumericValue(t)
			println("s" + sum)
		}
		if (sum % 10 == 0 ) return true
		return false
    }
}
