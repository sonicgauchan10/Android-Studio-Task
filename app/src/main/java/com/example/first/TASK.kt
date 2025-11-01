package com.example.first

fun main() {
    val wordsMeanings = mapOf(
        "innovation" to "the introduction of new ideas, methods, or products.",
        "education" to "the process of receiving or giving systematic instruction, especially at a school or university.",
        "teamwork" to "the combined action of a group, especially when effective and efficient.",
        "resilience" to "the capacity to recover quickly from difficulties; toughness.",
        "curiosity" to "a strong desire to know or learn something."
    )
    println("Enter a word to find its meaning: ")
    val input: String = readln().lowercase()
    println(wordsMeanings[input])
}