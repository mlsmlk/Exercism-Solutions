
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
	if(naturalNumber <= 0) throw RuntimeException()
	var sum = 0 
    for (i in 1..naturalNumber-1){
		if(naturalNumber % i == 0){
			sum += i
		}
	}
	
	if(naturalNumber == sum) return Classification.PERFECT
	else if(naturalNumber > sum) return Classification.DEFICIENT
	else return Classification.ABUNDANT
}
