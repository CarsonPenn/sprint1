fun getInstructions(recipeName: String): List<String> {
    return when (recipeName) {
        "Spaghetti" -> listOf("1. Boil water and cook the spaghetti.", "2. In a pan, sauté garlic in olive oil.", "3. Add tomato sauce and simmer.", "4. Toss cooked spaghetti in the sauce.")
        "Pancakes" -> listOf("1. Mix all ingredients in a bowl.", "2. Heat a skillet over medium heat.", "3. Pour batter into the skillet.", "4. Flip when bubbles form and cook until golden brown.")
        "Salad" -> listOf("1. Chop the lettuce, tomato, and cucumber.", "2. Toss together in a bowl.", "3. Drizzle olive oil and vinegar.", "4. Serve chilled.")
        else -> listOf()
    }
}
