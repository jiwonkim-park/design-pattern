package main.kotlin.factory.pizza

abstract class Pizza (
    open var name: String,
    open var dough: String = "Thin Crust Dough",
    open var sauce: String = "Tomato Sauce",
    open var toppings: ArrayList<String>
) {
    open fun prepare() {
        println("preparing $name")
        println("tossing dough")
        println("adding sauce")
        println("adding toppings:")
        for (topping in toppings) {
            println("   $topping")
        }
    }

    open fun bake() {
        println("bake for 25 minutes at 350")
    }

    open fun cut() {
        println("cutting the pizza into diagonal slices")
    }

    open fun box() {
        println("place pizza in official pizzastore box")
    }
}