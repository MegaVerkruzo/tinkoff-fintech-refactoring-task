package ru.tinkoff.fintech.refactoring.food

open class Pizza(
    override val name: String,
    override val ingredients: List<Pair<Ingredient, Int>>,
    override val cookingTime: Int = 0,
    override var price: Double = 0.0
) : CookedFood {
    init {
        ingredients.forEach { (ingredient, count) ->
            price += count * ingredient.price
        }
    }
}
