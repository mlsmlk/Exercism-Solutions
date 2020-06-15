class School {

	val list = mutableMapOf<String, Int>()
			
    fun add(student: String, grade: Int) = list.put(student,grade)
  
    fun grade(grade: Int): List<String> = list.filter{it.component2() == grade}.map{it.component1()}.sorted()    
    
	fun roster(): List<String> = list.toList().groupBy { it.second }
                .toList()
                .sortedBy { it.first }
                .flatMap { it.second.sortedBy { it.first } }
                .map { it.first }
}

