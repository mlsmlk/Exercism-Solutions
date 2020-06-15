class RotationalCipher( val num: Int) {

    fun encode(text: String): String {
        return text.map {
            when {
                it.isUpperCase() -> ('A' + ((it - 'A' + num) % 26))
                it.isLowerCase() -> ('a' + ((it - 'a' + num) % 26))
                else -> it
            }
        }.joinToString(separator = "")
    }
}