import kotlin.math.pow

class Squares (val n : Int) {

	fun sumOfSquares(): Int {
	  var sum = 0
       for(i in 1..n){
		   sum += i*i
    	}
		return sum
    }

    fun squareOfSum() : Int {
      var sum = 0
	   for(i in 1..n){
		   sum += i
    	}
		return sum * sum
    }

    fun difference() : Int {
        return squareOfSum() - sumOfSquares()
    }
}
