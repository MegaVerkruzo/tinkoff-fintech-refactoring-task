package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.sets.*

class CuisineCoffee : CuisineFood(
    arrayOf(
        Espresso(),
        Cappuccino()
    )
)