package ru.tinkoff.fintech.refactoring.food

interface CookedFood : SimpleFood {
    val cookingTime: Int
    val ingredients: Map<Ingredient, Int>
}