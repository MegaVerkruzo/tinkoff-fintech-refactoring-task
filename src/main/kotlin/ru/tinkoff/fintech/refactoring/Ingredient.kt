package ru.tinkoff.fintech.refactoring

enum class Ingredient(
    override val title: String,
    override val price: Double
) : SimpleFood {
    Egg("яйцо", 3.48),
    Bacon("бекон", 6.48),
    Dough("тесто", 1.00),
    Tomato("томат", 1.53),
    Olives("оливки", 1.53),
    Cheese("сыр", 0.98),
    Parmesan("пармезан", 3.98),
    Mushrooms("грибы", 3.34),
    Asparagus("спаржа", 3.34),
    ColdCuts("мясное ассорти", 9.38),
    BeefJerky("вяленая говядина", 12.24),
    Salami("салями", 4.24),
    Greenery("зелень", 0.67)
}