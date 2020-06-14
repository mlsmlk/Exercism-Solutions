import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        var num = input.toString().length
		var temp = input
		var sum = 0
		for ( i in 1..num){
			sum += (temp % 10).toDouble().pow(num).toInt()
			temp /= 10
		}
        if (sum == input ) return true
        return false
    }

}
