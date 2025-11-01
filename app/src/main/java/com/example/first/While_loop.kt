package com.example.first

fun main() {
    var i: Int = 0
    while (i < 5) {
        println(i)
        i++
    }
    var k = 1
    var fact = 1
    while (k < 6) { // setting the condition while k < 6
        fact *= k   // fact = fact * k (corrected from fact*k;)
        println("$k! = $fact")
        k++
    }
}