package com.example.first

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(from = 0, until = 10000)
    println("Please enter any number from 0 to 10000: ")
    while (true) {
        val userGuess = readln().toInt()

        if (userGuess == number) {
            println("Congratulations!!!!, you won")
            break
        } else if (userGuess < number) {
            println("Increase your guess")
        } else {
            println("Decrease your guess")
        }
    }
}