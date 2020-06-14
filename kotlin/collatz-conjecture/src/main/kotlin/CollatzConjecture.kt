object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start > 0){throw IllegalArgumentException()}
		var temp = start
		var step = 0
		while(temp != 1){
			if(temp % 2 == 0) temp /=2
			else temp = 3*temp+1
			step++
		}
		return step
    }
}
