package main.kotlin.decorator.beverage

class Decaf: Beverage("Decaf Coffee") {
    override fun cost(): Double = 1.05
}