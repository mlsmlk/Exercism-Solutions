class PhoneNumber (val num: String) {
		
	var temp = ""
    init{
		temp = num.filter{it.isDigit()}.replace(" ","")
		require(temp.length in 10..11)
		if(temp.length == 11) require(temp[0] =='1'){throw IllegalArgumentException()}
		temp = temp.takeLast(10)
		require (Character.getNumericValue(temp[0]) >= 2 && Character.getNumericValue(temp[3])>=2){throw IllegalArgumentException()}
		
	}
   val number: String = temp     
}
