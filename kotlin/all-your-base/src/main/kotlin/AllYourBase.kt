import kotlin.math.pow
class BaseConverter (val oldBase: Int, val num : IntArray ){
      init {
        require(oldBase >= 2) { "Bases must be at least 2." }
        require(num.isNotEmpty()) { "You must supply at least one digit." }
        require(num.first() != 0 || num.size == 1) { "Digits may not contain leading zeros." }
        require(num.all { it >= 0 }) { "Digits may not be negative." }
        require(num.all { it < oldBase }) { "All digits must be strictly less than the base." }
    }

   fun convertToBase(newBase: Int): IntArray {
	    require(newBase >= 2) { "Bases must be at least 2." }
	    if (num.size ==1 && num.first() == 0) return num
        var old = 0
		var new : MutableList<Int> = mutableListOf()
		for(i in 0..num.size-1){
			old+= num[i] * oldBase.toDouble().pow(num.size-1-i).toInt()
		}
		while (old != 0){
			new.add(old % newBase)
			old /= newBase
		}
        
		return new.reversed().toIntArray()
    }
}

