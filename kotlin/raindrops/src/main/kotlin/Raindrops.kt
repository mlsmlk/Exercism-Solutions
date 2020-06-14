object Raindrops {

    fun convert(n: Int): String {
    	var str = StringBuilder()
       if(n % 3 == 0) str.append("Pling")
       if(n % 5 == 0 ) str.append("Plang")
       if (n % 7 == 0) str.append("Plong")
       if(str.length ==0) return n.toString()
       return str.toString()
    }
}
