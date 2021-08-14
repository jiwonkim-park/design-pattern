package main.kotlin.command

class RemoteControl {
    private val onCommands: Array<Command> = emptyArray()
    private val offCommands: Array<Command> = emptyArray()

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPressed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPressed(slot: Int) {
        offCommands[slot].execute()
    }
}