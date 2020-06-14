import kotlin.*
class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
		var parts = matrixAsString.split("\n")
		var list: MutableList<Int> = mutableListOf( )
        for(i in 0..parts.size-1){
           var p = parts.get(i).split(" ")
		   list.add(p.get(colNr-1).toInt())
        }
		return list
    }

    fun row(rowNr: Int): List<Int> {
        var parts = matrixAsString.split("\n")
		var list: MutableList<Int> = mutableListOf( )
		var p = parts.get(rowNr-1).split(" ")
        for(i in 0..p.size-1){
            list.add(p.get(i).toInt())
        }
        return list
    }
}
