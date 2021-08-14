package main.kotlin.factory.v1

class PizzaStore(
    val factory: SimplePizzaFactory
) {
    fun orderPizza(type: String) =
        factory.createPizza(type).let {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
            it
        }

}