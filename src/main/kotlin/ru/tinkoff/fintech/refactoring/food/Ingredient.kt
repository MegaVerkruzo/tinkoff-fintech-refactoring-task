package ru.tinkoff.fintech.refactoring.food

open class Ingredient(
    override val name: String,
    override val price: Double = 0.0
) : SimpleFood