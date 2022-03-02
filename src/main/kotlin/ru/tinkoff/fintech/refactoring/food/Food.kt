package ru.tinkoff.fintech.refactoring.food

interface Food {
    val name: String
    
    fun getPrice(): Double
}