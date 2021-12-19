package com.example.chopshop

//fun main(args: Array<String>) {println(args.contentToString()) }
open class Shape(){}

class Rectangle(var height: Double, var length: Double): Shape()
{
    //they just declared this parameter like a function via arguments from a constructor
    var perimeter = (height + length) * 2
}

//Extra content send to other branch; back at master...THIS IS FRICKIN MINT M8
//LEMME PULL REQUEST
fun main()
{
//    val a: Int = 1
//    var b: Int = 3
//    b += 1
//    println(sum(a,b))

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

    var a = 1
    val s1 = "a is $a"
    a = 2
                    //a specific segment of the string got replaced
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    print(s2)
}

//------------------------------------------------------------------------------
//fun sum(a: Int, b: Int): Int {return a + b}

//A function body can be an expression. Its return type is inferred.
fun sum(a: Int, b: Int) = a + b
fun maxOf(a: Int, b: Int) = if (a > b) a else b

