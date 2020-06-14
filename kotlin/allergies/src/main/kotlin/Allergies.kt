class Allergies(val score: Int) {

    fun getList() = Allergen.values().toList().filter{isAllergicTo(it)}

    fun isAllergicTo(allergen: Allergen) = score and allergen.score != 0
}
