package ru.tinkoff.fintech.refactoring.food

enum class Coffee(
    override val title: String,
    val cookingTime: Int,
    override val price: Double
) : SimpleFood {
    Espresso("эспрессо", 5, 5.0),
    Cappuccino("капучино", 6, 3.48);
}

