object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        if (factors.isEmpty() || limit < factors.elementAt(0)) return 0
		var sum = 0
		var temp = 0 
		for (j in 1..limit-1){
			for( i in 0..factors.size-1){
				if((factors.elementAt(i)) == 0) continue
				if(j % (factors.elementAt(i)) == 0){
					if( temp == j) break
					temp = j
					sum+=j
				}
				println("j"+ j)
				println (sum)
			}
		}
		return sum
		
    }
}
