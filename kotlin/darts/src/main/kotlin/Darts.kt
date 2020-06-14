import kotlin.math.pow
import kotlin.math.sqrt
object Darts {

    fun score(xx: Number, yy: Number): Int {
		val x = xx.toDouble()
		val y= yy.toDouble()
		val dist = sqrt(x.pow(2)+y.pow(2))

      	if( dist > 10) return 0
		else if (dist in 5.01..10.0) return 1
      	else if (dist in 1.01..5.0)return 5
        else return 10
    }
}
