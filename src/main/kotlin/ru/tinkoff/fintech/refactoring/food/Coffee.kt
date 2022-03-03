package ru.tinkoff.fintech.refactoring.food

open class Coffee(
    override val name: String,
    override val cookingTime: Int,
    override val price: Double,
    override val ingredients: List<Pair<Ingredient, Int>> = listOf()
) : ProcessedFood