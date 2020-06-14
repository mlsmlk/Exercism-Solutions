object BeerSong {
    fun verses(startBottles: Int, takeDown: Int) : String{
		require(startBottles >= takeDown && startBottles in 0..99  && takeDown in 0..99)
        var str = StringBuilder()
		for(i in startBottles downTo takeDown){
			if(i == 0) str.append("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")
			else if(i == 1) str.append("1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
			else if(i==2) str.append("$i bottles of beer on the wall, $i bottles of beer.\nTake one down and pass it around, ${i-1} bottle of beer on the wall.\n")
			else str.append("$i bottles of beer on the wall, $i bottles of beer.\nTake one down and pass it around, ${i-1} bottles of beer on the wall.\n")
			if(i != takeDown) str.append("\n")
		}
		return str.toString()
    }
}
