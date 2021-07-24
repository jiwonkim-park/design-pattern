package main.kotlin.decorator.condiment

import main.kotlin.decorator.beverage.Beverage

abstract class CondimentDecorator(
    override var description: String
): Beverage() {
}