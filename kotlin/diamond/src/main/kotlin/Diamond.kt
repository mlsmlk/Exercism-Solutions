
class DiamondPrinter {
	fun printToList(letter : Char) : List<String>{
		var num = letter.toInt() - 'A'.toInt()
		var list:MutableList<String> = mutableListOf()
		for(i in 0..num){
			var side_space = " ".repeat((num -i))
			if (i ==0) list.add(side_space+ ('A'.toInt() + i).toChar()+ side_space)
			
			else {
				var middle_space = " ".repeat((1 +(2*(i-1))))
				list.add(side_space+ ('A'.toInt() + i).toChar()+ middle_space+('A'.toInt() + i).toChar()+ side_space)
			}
		}
        list.addAll(list.subList(0,num).asReversed())
		return list
	}


}
