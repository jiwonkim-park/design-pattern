package main.kotlin.decorator.condiment

import main.kotlin.decorator.beverage.Beverage

class Whip(
    private val beverage: Beverage
) : CondimentDecorator(
    "${beverage.description}, Whip"
) {
    override fun cost(): Double = beverage.cost() + .10
}