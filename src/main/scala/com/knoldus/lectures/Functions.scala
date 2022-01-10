package com.knoldus.lectures

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 8))

  // auxiliary function
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  // a function with side effect
  def aFunctionWithSideEffects(str: String): Unit = println(str)

  /*
  Exercises:
  1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2.  Factorial function 1 * 2 * 3 * .. * n
  3.  A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n - 1) + f(n - 2)
  */

  def greet(name: String,age: Int) ={
    s"Hi, my name is $name and I'm $age years old."
  }
  println(greet("Pragati",22))

  def fact(n: Int): Int = {
    if (n == 1) 1
    else n * fact(n-1)
  }
  println(fact(5))

  def fibo (num: Int): Int = {
    if (num < 3) 1
    else fibo(num-1) + fibo(num-2)
  }
  println(fibo(8))
}
