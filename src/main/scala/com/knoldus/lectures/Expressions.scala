package com.knoldus.lectures

object Expressions extends App{

    val x = 1 + 2 // its an expression
    println(x)

    println(2 + 3 * 4)

    var aVariable = 2
    aVariable += 3 // its a side effect
    println(aVariable)


    // IF expression
    val aCondition = false
    val ifCondition = if(aCondition) 10 else 5 // IF EXPRESSION
    println(ifCondition)
    println(if(aCondition) 78 else 23)


    val a = (aVariable = 3) // Unit === void
    println(a)

    //some side effects are println(), loops, reassignment of values

    // Code blocks
    val aCodeBlock = {
      val y = 2
      val z = y + 1
      if (z > 2) "hello" else "goodbye"
    }

    val someValue = {
      println("hello")
      2 < 3              // it will only consider the last value as value of code block
    }
    println(someValue)

    val someDiffValue = {
      if(someValue) 239 else 986
      29
    }
    println(someDiffValue)

}
