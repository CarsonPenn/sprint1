data class Ingredient(val name: String,
                      val quantity: Double,
                      val unit: String)

fun getIngredients(recipeName: String): List<Ingredient> {
    return when (recipeName) {
        "Spaghetti" -> listOf(
            Ingredient("Spaghetti noodles", 200.0, "grams"),
            Ingredient("Tomato sauce", 250.0, "ml"),
            Ingredient("Garlic", 2.0, "cloves"),
            Ingredient("Olive oil", 2.0, "tbsp"),
            Ingredient("Salt", 1.0, "tsp")
        )
        "Pancakes" -> listOf(
            Ingredient("Flour", 1.5, "cups"),
            Ingredient("Eggs", 2.0, "pieces"),
            Ingredient("Milk", 1.0, "cup"),
            Ingredient("Butter", 2.0, "tbsp"),
            Ingredient("Baking powder", 2.0, "tsp")
        )
        "Salad" -> listOf(
            Ingredient("Lettuce", 1.0, "head"),
            Ingredient("Tomato", 2.0, "pieces"),
            Ingredient("Cucumber", 1.0, "piece"),
            Ingredient("Olive oil", 2.0, "tbsp"),
            Ingredient("Vinegar", 1.0, "tbsp")
        )
        else -> listOf()
    }
}
