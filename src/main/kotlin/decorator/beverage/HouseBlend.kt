package main.kotlin.decorator.beverage

class HouseBlend : Beverage("House Blend Coffee") {
    override fun cost(): Double = .89
}