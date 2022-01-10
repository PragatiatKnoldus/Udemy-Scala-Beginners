package com.knoldus.lectures

object Recursion extends App{

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def anotherFactorial(n: Int): BigInt = {
    def anAuxilaryFunction(a: Int, acc: BigInt): BigInt = {
      if (a <= 1) acc
      else anAuxilaryFunction(a - 1, a * acc)
    }

    anAuxilaryFunction(n, 1)

  }
  println(anotherFactorial(200))

  def fibonacci(num: Int, a: Int = 0, b: Int = 1): Unit = {
    if (num != 0) {
      print(a + " ")
      fibonacci(num - 1, b, a + b)
    }
  }
}