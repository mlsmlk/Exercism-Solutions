class Anagram(val str: String) {
    fun match(anagrams: Collection<String>): Set<String> {
        return anagrams.filter{it.length == str.length}
					    .filterNot{it.equals(str,true)}
					    .filter{str.toLowerCase().toList().sorted() == it.toLowerCase().toList().sorted()}
                        .toSet()
    }
}
