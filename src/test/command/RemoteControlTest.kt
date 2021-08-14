package test.command

import main.kotlin.command.RemoteControl
import main.kotlin.command.garage.Garage
import main.kotlin.command.garage.GarageDownCommand
import main.kotlin.command.garage.GarageUpCommand
import main.kotlin.command.light.Light
import main.kotlin.command.light.LightOffCommand
import main.kotlin.command.light.LightOnCommand
import main.kotlin.command.stereo.Stereo
import main.kotlin.command.stereo.StereoOffCommand
import main.kotlin.command.stereo.StereoOnCommand
import org.junit.Test

class RemoteControlTest {
    @Test
    fun remoteControl() {
        val remoteControl = RemoteControl()

        // receivers
        val livingRoomLight = Light("Living Room")
        val kitchenLight = Light("Kitchen")
        val garage = Garage(Light("Garage"))
        val stereo = Stereo()

        val livingRoomLightOnCommand = LightOnCommand(livingRoomLight)
        val kitchenLightOnCommand = LightOnCommand(kitchenLight)
        val garageUpCommand = GarageUpCommand(garage)
        val stereoOnCommand = StereoOnCommand(stereo)

        val livingRoomLightOffCommand = LightOffCommand(livingRoomLight)
        val kitchenLightOffCommand = LightOffCommand(kitchenLight)
        val garageDownCommand = GarageDownCommand(garage)
        val stereoOffCommand = StereoOffCommand(stereo)

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand)
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand)
        remoteControl.setCommand(2, garageUpCommand, garageDownCommand)
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand)

    }
}