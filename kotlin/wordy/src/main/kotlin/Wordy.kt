object Wordy {


    fun answer(input: String): Int {
	
		var result = 0
		var temp = 0 
		var arg1 =0
		for (i in 0..input.length-1){
			if(input.get(i).isDigit()){
				if(arg1 >= 0 ){
					arg1 += Character.getNumericValue(input.get(i))
				}else{
					arg1 -= Character.getNumericValue(input.get(i))
				}
				if(input.get(i-1).compareTo('-') == 0){
					arg1 = arg1 *(-1)
				}
				if(input.get(i+1).isDigit()){
					arg1 = arg1 * 10
					continue
				}
				println ("Arg" + arg1)
			}
		  if(result == 0){
			  result = arg1
			  print ("result" + result)
		  }else{
			  if ( "plus" in input) {
				   result += arg1
				  println ("p" + result)
		       } else if ("minus" in input){
		           result -= arg1
				   println ("m" + result)
		       } else if ("multiplied" in input){
		          if(arg1 != 0)
					   result *= arg1	  
				   println ("mu" + result)
		       }else if ("divided" in input){
		           if(arg1 != 0) 
		        	   result /= arg1
				   println ("d " +result)
		       }else{
		           result = if( arg1 != 0) arg1 else result
				   println (result)		  
		       }
		  }
			 arg1 =0
		}
             
		return result
	}
	

}
