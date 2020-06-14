object PascalsTriangle {

    fun computeTriangle(rows: Int): List<List<Int>> {
        if (rows == 0) { return emptyList() }
		
        val list = List(rows) { mutableListOf<Int>() }
        list[0].add(1)
		
        for (i in 1..rows-1) {
            for(j in 0..i) {
                list[i].add(list[i-1].getOrElse(j-1){0} + list[i-1].getOrElse(j){0})       
            }
        }

        return list
    }
}