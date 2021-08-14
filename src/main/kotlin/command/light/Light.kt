package main.kotlin.command.light

class Light(
    private val kind: String
) {
    fun on() {
        print("$kind light on")
    }

    fun off() {
        print("$kind light off")
    }
}