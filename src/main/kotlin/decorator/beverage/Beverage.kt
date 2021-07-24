package main.kotlin.decorator.beverage

abstract class Beverage(
    open var description: String = "Unknown Beverage"
) {
    abstract fun cost(): Double

    override fun toString(): String =
        "$description $${cost()}"

}