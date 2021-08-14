package main.kotlin.adapter

class TurkeyAdapter(
        val turkey: Turkey
) : Duck {
    override fun quack() = turkey.gobble()

    override fun fly(): String {
        val flyStr = ""
        for (i in 0..4) {
            flyStr.plus(turkey.fly() + " ")
        }
        return flyStr
    }
}