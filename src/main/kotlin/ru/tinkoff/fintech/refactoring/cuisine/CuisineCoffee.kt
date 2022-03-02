package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.*

class CuisineCoffee : CuisineFood(
    arrayOf(
        Espresso(),
        Cappuccino()
    )
) {

}

