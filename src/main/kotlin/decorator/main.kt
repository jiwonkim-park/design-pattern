package main.kotlin.decorator

import main.kotlin.decorator.beverage.Beverage
import main.kotlin.decorator.beverage.DarkRoast
import main.kotlin.decorator.beverage.Espresso
import main.kotlin.decorator.beverage.HouseBlend
import main.kotlin.decorator.condiment.Mocha
import main.kotlin.decorator.condiment.Soy
import main.kotlin.decorator.condiment.Whip

fun main() {
    val beverage = Espresso()
    println(beverage)

    var beverage2 = DarkRoast() as Beverage
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println(beverage2)

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println(beverage3)
}