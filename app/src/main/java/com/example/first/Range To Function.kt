package com.example.first

fun main() {
    // Creating character ranges
    var myCharRange = 'a'.rangeTo('j')
    var testCharRange = 'a'..'j'

    var check = 'Z' in testCharRange
    println("myCharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)
}