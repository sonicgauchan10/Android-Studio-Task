package com.example.first

fun main() {
    var result: Int = 5 + 2 * 4
    println("5 + 2 * 4 = $result")
    result = (5 + 2) * 4
    println("(5 + 2) * 4 = $result")

    var x: Int = 8
    var y: Int = 4
    var z: Int = 2
    var sum: Int = 0

    sum = x + --y + --z
    println("x + --y + --z ::: $sum")
    println("Final values: x = $x, y = $y, z = $z")
}