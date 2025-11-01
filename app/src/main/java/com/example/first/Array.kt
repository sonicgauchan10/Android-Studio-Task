package com.example.first

fun main(args: Array<String>){
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element of age is "+ age[0])
    println("The second element of age is "+ age[1])
    println("The third element of age is "+ age[2])

    println("**********************************")

    var name = arrayOf("ram", "shyam", "hari")
    name[1] = "sandis"
    println("The first element of age is "+ name[0])
    println("The second element of age is "+ name[1])
    println("The third element of age is "+ name[2])

    println(name.size)
}