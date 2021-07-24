package main.kotlin.decorator.condiment

import main.kotlin.decorator.beverage.Beverage

class Soy(
    private val beverage: Beverage
): CondimentDecorator(
    "${beverage.description}, Soy"
) {
    override fun cost(): Double = beverage.cost() + .15
}