package com.example.first

fun main(args: Array<String>){
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var name = arrayListOf("sandis", "ram", "shyam")
    name.add("hari")
    name.add(4,"Sita")

    name.remove("shyam")
    name.removeAt(0)

    println(name)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    print(mixArrayList[0])
    print(mixArrayList[1])
    print(mixArrayList[2])

}