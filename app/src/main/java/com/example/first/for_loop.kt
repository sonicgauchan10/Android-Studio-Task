package com.example.first

fun main() {
    for (i in 1..9) {
        println(i)
    }
    var sum: Int = 0
    for (x in 0..5) {
        println(x)
        sum += x // sum = sum + x
    }
    var evenSum: Int = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            evenSum += x // sum = sum + x
        }
    }
    println("The sum of even number is $evenSum")

    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    println("Vehicle list:")
    for (y in vehicle.indices) {
        println("The value in $y index is: ${vehicle[y]}")
    }


}