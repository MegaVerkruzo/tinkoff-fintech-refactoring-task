package ru.tinkoff.fintech.refactoring.food

enum class Coffee(
    override val title: String,
    override val cookingTime: Int,
    override val price: Double,
    override val ingredients: Map<Ingredient, Int> = mapOf()
) : CookedFood {
    Espresso("эспрессо", 5, 5.0),
    Cappuccino("капучино", 6, 3.48);
}

