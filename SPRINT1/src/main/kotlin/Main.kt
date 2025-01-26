

fun main() {
    val recipes = listOf("Spaghetti", "Pancakes", "Salad")

    var continueProgram = true

    while (continueProgram) {
        println("Welcome to the Recipe Book!")
        println("Choose a recipe by entering the number, or enter 0 to quit:")

        // Display the recipe list
        recipes.forEachIndexed { index, recipe ->
            println("${index + 1}. $recipe")
        }

        // Get user's choice
        val choice = readlnOrNull()?.toIntOrNull()

        if (choice == 0) {
            println("Thank you for using the Recipe Book. Goodbye!")
            continueProgram = false
        } else if (choice in 1..recipes.size) {
            val selectedRecipe = recipes[choice!! - 1]
            val details = getDetails(selectedRecipe)
            val ingredients = getIngredients(selectedRecipe)
            val instructions = getInstructions(selectedRecipe)

            println("\nRecipe: $selectedRecipe")
            if (details != null) {
                println("\nDetails:")
                println("- Category: ${details.category}")
                println("- Rating: ${details.rating}")
                println("- Preparation Time: ${details.prepTime} minutes")
                println("- Cooking Time: ${details.cookTime} minutes")
                println("- Total Time: ${details.totalTime} minutes")
                println("- Gluten Free: ${if (details.glutenFree) "Yes" else "No"}")
                println("- Vegan: ${if (details.vegan) "Yes" else "No"}")
            } else {
                println("No details available for this recipe.")
            }

            println("\nIngredients:")
            ingredients.forEach {
                println("- ${it.quantity} ${it.unit} of ${it.name}")
            }

            println("\nInstructions:")
            instructions.forEach { println(it) }

            // Prompt to return to the main menu
            println("\nPress Enter to return to the main menu.")
            readlnOrNull() // Wait for the user to press Enter
        } else {
            println("Invalid choice, please try again.")
        }
    }
}