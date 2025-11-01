package com.example.first

fun displayList(){
    val numbers : List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("third element: ${numbers.get(2)}")
    println("fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

}