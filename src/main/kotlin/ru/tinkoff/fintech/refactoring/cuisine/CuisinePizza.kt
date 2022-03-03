package ru.tinkoff.fintech.refactoring.cuisine

import ru.tinkoff.fintech.refactoring.food.sets.*

class CuisinePizza : CuisineProcessedFood(
    arrayOf(
        Carbonara(),
        Marinara(),
        Sardinia(),
        Valtellina(),
        Peasant()
    )
)

