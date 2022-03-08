package ru.tinkoff.fintech.refactoring

import ru.tinkoff.fintech.refactoring.Ingredient.*

enum class Pizza(
    override val title: String,
    val ingredients: Map<Ingredient, Int>
) : SimpleFood {
    Carbonara(
        "карбонара", mapOf(
            Egg to 1,
            Bacon to 2,
            Dough to 1,
            Cheese to 2
        )
    ),
    Marinara(
        "маринара", mapOf(
            Tomato to 2,
            Olives to 3,
            Dough to 1
        )
    ),
    Sardinia(
        "сардиния", mapOf(
            Salami to 3,
            Olives to 1,
            Dough to 1,
            Cheese to 3
        )
    ),
    Valtellina(
        "вальтеллина", mapOf(
            BeefJerky to 1,
            Greenery to 1,
            Dough to 1,
            Parmesan to 2
        )
    ),
    Peasant(
        "крестьянская", mapOf(
            Mushrooms to 3,
            Tomato to 1,
            Dough to 1,
            Asparagus to 1,
            ColdCuts to 1
        )
    );

    override val price: Double
        get() = ingredients.toList().sumOf { (ingredient, amount) -> ingredient.price * amount }
}
