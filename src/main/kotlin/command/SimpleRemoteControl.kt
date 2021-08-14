package main.kotlin.command

class SimpleRemoteControl(
    var slot: Command? = null
) {
    fun setCommand(command: Command) {
        this.slot = command
    }

    fun buttonWasPressed() {
        slot?.execute()
    }
}