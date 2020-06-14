class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

	val isEquilateral: Boolean = a == b && b == c && a.toDouble() > 0
	val isIsosceles: Boolean = a == b || a == c || b == c
	val isScalene: Boolean = let {
		val a_d = a.toDouble()
		val b_d = b.toDouble()
		val c_d = c.toDouble()
		
		if ((a_d + b_d) < c_d || (b_d + c_d) < a_d || (a_d + c_d) < b_d || (a == 0 && b == 0 && c == 0))
			throw java.lang.IllegalArgumentException()
		!isEquilateral && !isIsosceles
	}}