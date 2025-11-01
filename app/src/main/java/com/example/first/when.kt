package com.example.first

fun main() {
    print("Please enter a day number of week : ")
    val dayNumber: Int = readln().toInt()
    val day: String

    when(dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }

    println(day)
}