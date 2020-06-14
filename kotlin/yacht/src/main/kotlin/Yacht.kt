object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
       var points = 0
		 if (category == YachtCategory.YACHT){
			for(i in 1..dices.size-1){
				if(dices.elementAt(i) == dices.elementAt(i-1)) continue
				else return 0
			}
			return 50
		}else if (category == YachtCategory.ONES){
			for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 1) points++
			}
			 return points
		}else if (category == YachtCategory.TWOS){
			 for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 2) points +=2
			}
			 return points
			
		}else if (category == YachtCategory.THREES){
			for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 3) points+=3
			}
			 return points
		}else if (category == YachtCategory.FOURS){
			for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 4) points+=4
			}
			 return points
		}else if (category == YachtCategory.FIVES){
			for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 5) points+=5
			}
			 return points
		}else if (category == YachtCategory.SIXES){
			for(i in 0..dices.size-1){
				if(dices.elementAt(i) == 6) points+=6
			}
			 return points
		}else if (category == YachtCategory.FULL_HOUSE){
			for(i in 0..dices.size-1){
				points += dices.elementAt(i)
			}
			 for (j in 0..dices.size-1){
				 if((dices.count{it == dices.elementAt(j)}) == 3) return points
				}
			 return 0
		}else if (category == YachtCategory.FOUR_OF_A_KIND){
			 var flag = true
			 for (j in 0..dices.size-1){
				  if((dices.count{it == dices.elementAt(j)}) >= 4)
					  return 4 * dices.elementAt(j)
				}
			 return 0
		}else if (category == YachtCategory.LITTLE_STRAIGHT){
			if(listOf(1,2,3,4,5)== dices.sorted()) 
                return 30
			return 0
		 }else if (category == YachtCategory.BIG_STRAIGHT){
			if(listOf(2,3,4,5,6)== dices.sorted()) 
                return 30
			return 0
		}else if (category == YachtCategory.CHOICE){
			for(i in 0..dices.size-1){
				points += dices.elementAt(i)
			}
			 return points
		}
		return 0
    }
}
