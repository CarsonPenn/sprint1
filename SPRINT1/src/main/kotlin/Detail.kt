data class Detail(
    val category: String, // For example, "Main" or "Dessert"
    val rating: Double,   // For example, 4.5
    val prepTime: Double, // In minutes
    val cookTime: Double, // In minutes
    val totalTime: Double,// In minutes
    val glutenFree: Boolean,
    val vegan: Boolean
)



fun getDetails(recipeName: String): Detail? {
    return when (recipeName) {
        "Spaghetti" -> Detail(
            category = "Main",
            rating = 4.5,
            prepTime = 10.0,
            cookTime = 20.0,
            totalTime = 30.0,
            glutenFree = true,
            vegan = true
        )
        "Pancakes" -> Detail(
            category = "Breakfast",
            rating = 4.0,
            prepTime = 15.0,
            cookTime = 10.0,
            totalTime = 25.0,
            glutenFree = false,
            vegan = false
        )
        else -> null
    }
}