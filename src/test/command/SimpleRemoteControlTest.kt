package test.command

import main.kotlin.command.SimpleRemoteControl
import main.kotlin.command.light.Light
import main.kotlin.command.light.LightOnCommand
import org.junit.Test

internal class SimpleRemoteControlTest {
    @Test
    fun commandTest() {
        val light = Light("Simple")
        val lightOnCommand = LightOnCommand(light)

        val remoteControl = SimpleRemoteControl()
        remoteControl.setCommand(lightOnCommand)

        remoteControl.buttonWasPressed()

    }
}