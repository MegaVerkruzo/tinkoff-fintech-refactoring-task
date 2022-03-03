package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.sets.*

class CuisineCoffee : CuisineProcessedFood(
    arrayOf(
        Espresso(),
        Cappuccino()
    )
)