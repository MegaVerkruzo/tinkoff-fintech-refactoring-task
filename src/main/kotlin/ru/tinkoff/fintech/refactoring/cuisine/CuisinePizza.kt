package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.sets.*

class CuisinePizza : CuisineFood(
    arrayOf(
        Carbonara(),
        Marinara(),
        Sardinia(),
        Valtellina(),
        Peasant()
    )
)

