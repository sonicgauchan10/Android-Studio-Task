package com.example.first

fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )
    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
}