import kotlin.*

object ResistorColor {
	
	val colors :List <String> = listOf("black","brown","red","orange","yellow","green","blue","violet","grey","white")
	
    fun colorCode(input: String): Int = colors.indexOf(input)

    fun colors(): List<String> {
		return colors
    }

}
