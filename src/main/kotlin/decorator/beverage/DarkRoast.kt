package main.kotlin.decorator.beverage

class DarkRoast : Beverage("Dark Roast Coffee") {
    override fun cost(): Double = .99
}