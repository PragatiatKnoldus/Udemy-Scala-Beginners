package com.knoldus.lectures

object CBNandCBV extends App{

  def callByValue(a: Int): Unit = {
    println("by value: " + 5)
    println("by value: " + 5)
  }

  def callByName(a: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  callByValue(3)
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite())

}
