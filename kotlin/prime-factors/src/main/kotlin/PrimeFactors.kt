object PrimeFactorCalculator {

   fun primeFactors(int: Int): List<Int> {
        return primeFactors(int.toLong()).map { it.toInt() }
    }

    fun primeFactors(long: Long): List<Long> {
    	var list: MutableList <Long> = mutableListOf()
		 for (i in 2..long) {
            if (long % i == 0L) {
                return list.plus(i) + primeFactors(long/i)
            }
        }
        return list
    }
}