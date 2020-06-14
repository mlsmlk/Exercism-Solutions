import java.time.LocalDateTime
import java.time.LocalDate
import kotlin.math.*

class Gigasecond(givenDateTime: LocalDateTime) {
	constructor(givenDate: LocalDate): this(givenDate.atStartOfDay())	

    val date: LocalDateTime = givenDateTime.plusSeconds(10.0.pow(9).roundToLong())
}