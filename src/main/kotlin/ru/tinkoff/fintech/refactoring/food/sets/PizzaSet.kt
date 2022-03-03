package ru.tinkoff.fintech.refactoring.food.sets

import ru.tinkoff.fintech.refactoring.food.Pizza

class Carbonara : Pizza(
    "карбонара",
    listOf(
        Egg() to 1,
        Bacon() to 2,
        Dough() to 1,
        Cheese() to 2
    )
)

class Marinara : Pizza(
    "маринара",
    listOf(
        Tomato() to 2,
        Olives() to 3,
        Dough() to 1
    )
)

class Sardinia : Pizza(
    "сардиния",
    listOf(
        Salami() to 3,
        Olives() to 1,
        Dough() to 1,
        Cheese() to 3
    )
)

class Valtellina : Pizza(
    "вальтеллина",
    listOf(
        BeefJerky() to 1,
        Greenery() to 1,
        Dough() to 1,
        Parmesan() to 2
    )
)

class Peasant : Pizza(
    "крестьянская",
    listOf(
        Mushrooms() to 3,
        Tomato() to 1,
        Dough() to 1,
        Asparagus() to 1,
        ColdCuts() to 1
    )
)