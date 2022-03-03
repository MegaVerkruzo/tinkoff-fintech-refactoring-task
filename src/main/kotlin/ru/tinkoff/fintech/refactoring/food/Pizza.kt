package ru.tinkoff.fintech.refactoring.food

open class Pizza(
    override val name: String,
    override val ingredients: List<Pair<Ingredient, Int>>,
    override val cookingTime: Int = 0,
    override var price: Double = 0.0
) : ProcessedFood {
    init {
        ingredients.forEach { ingredient ->
            val ingredientType: Ingredient = ingredient.first
            val count: Int = ingredient.second

            price += count * ingredientType.price
        }
    }
}
