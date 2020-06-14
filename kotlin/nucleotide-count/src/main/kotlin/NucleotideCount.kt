class Dna (var input: String) {

       init{
		   require(input.all{it == 'A' || it == 'T' || it == 'C' || it =='G'}){throw IllegalArgumentException()}
				}
       val nucleotideCounts: Map<Char, Int>
        get() {
            val map = input.groupBy { it }
            return mapOf(
                    'A' to (map['A']?.count() ?: 0),
                    'C' to (map['C']?.count() ?: 0),
                    'G' to (map['G']?.count() ?: 0),
                    'T' to (map['T']?.count() ?: 0)
            )
        }
}
