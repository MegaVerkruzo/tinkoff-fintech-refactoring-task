package ru.tinkoff.fintech.refactoring

enum class Coffee(
    override val title: String,
    val brewTime: Int,
    override val price: Double
) : SimpleFood {
    Espresso("эспрессо", 5, 5.0),
    Cappuccino("капучино", 6, 3.48);
}

