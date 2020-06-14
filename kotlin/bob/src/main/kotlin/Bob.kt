object Bob {
    fun hey(input: String) :String = when {
		input.toString().replace(" ","").replace("\t", "").isBlank() -> "Fine. Be that way!"	
		input.filter { it.isLetter() }.count() > 0 && input.filter { it.isLetter() }.all { it.isUpperCase() } && input.trim().endsWith("?") ->  "Calm down, I know what I'm doing!"
		input.filter { it.isLetter() }.count() > 0 && input.filter { it.isLetter() }.all { it.isUpperCase() } -> "Whoa, chill out!"
		input.trim().endsWith("?") -> "Sure."
		else -> "Whatever."

    }
}