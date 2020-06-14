object RunLengthEncoding {

    fun encode(input: String): String {
    	if(input == "") return ""
        var temp = input + "_"
		var count = 1
		var encoded = ""
		for (i in 1..temp.length-1){
			if(temp.get(i) == temp.get(i-1)){
				count ++
			}else{
				if( count != 1){
					encoded = encoded + count + temp.get(i-1)
					count = 1 
				}else {
					encoded += temp.get(i-1)
				}
			}
		}
		return encoded 
    }
}
    fun decode(input: String): String {
		var decoded = ""
        var digit =0
	    for(i in 0..input.length-1){
			 if(input.get(i).isDigit()){
				 if(input.get(i+1).isDigit()){
					  digit += Character.getNumericValue(input.get(i)) *10
					}else{
                  digit +=Character.getNumericValue(input.get(i))
				 }
			 }else{
                 if(digit != 0){
                   repeat(digit){
                       decoded += input.get(i)
                   }
                   digit =0
                 }else{
                    decoded += input.get(i) 
                 }
             }
		}
		return decoded    
}
