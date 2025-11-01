package com.example.first

fun main() {
    val studentMarks = mapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45
    )
    println("Enter student name: ")
    val input: String = readln().lowercase()
    val mark = studentMarks[input]
}