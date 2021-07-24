package main.kotlin.decorator.condiment

import main.kotlin.decorator.beverage.Beverage

class Mocha(
    private val beverage: Beverage
): CondimentDecorator(
    "${beverage.description}, Mocha"
) {
    override fun cost(): Double = beverage.cost() + .20
}