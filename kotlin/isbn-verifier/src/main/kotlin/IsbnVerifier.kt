class IsbnVerifier {

    fun isValid(number: String): Boolean {
        var str = number.replace("-","")
		if (str.length != 10)return false
		var n = 10
		var sum = 0
		for(i in 0..str.length-1 ){
			if(str[i].isDigit()){
				sum += Character.getNumericValue(str[i]) * n
			}else if(str[i] == 'X' && i == str.length-1){
				sum+= 10 * n
			} else return false
			n--
		}
		if( sum % 11 == 0)return true
		return false
    }
}
