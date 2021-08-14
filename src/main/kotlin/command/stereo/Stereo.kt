package main.kotlin.command.stereo

class Stereo {
    fun on() = println("stereo on")

    fun off() = println("stereo off")

    fun setCd() = println("stereo set cd")

    fun setDvd() = println("stereo set dvd")

    fun setRadio() = println("stereo set radio")

    fun setVolume(vol: Int) = println("stereo set volume to $vol")
}