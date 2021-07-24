package main.kotlin.decorator.condiment

import main.kotlin.decorator.beverage.Beverage

class SteamedMilk(
    private val beverage: Beverage
) : CondimentDecorator(
    "${beverage.description}, Steamed Milk"
) {
    override fun cost(): Double = beverage.cost() + .10
}