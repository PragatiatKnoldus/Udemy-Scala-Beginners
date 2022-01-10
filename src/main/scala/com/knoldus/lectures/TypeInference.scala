package com.knoldus.lectures

object TypeInference extends App{

  val num: Int = 22
  val newNumber = 25
  val message = "Hello my name is Pragati and my age is "
  val newMessage = message + num // add -> String (String + Integer)
  println(newMessage)

  // scala will take the type of the function automatically, but it should be correct as per right hand side.
  def add (x: Int = 78, y: Int = 109) = x + y
  println(add())

  // in case of a recursive function specifying the type is mandatory.
}
