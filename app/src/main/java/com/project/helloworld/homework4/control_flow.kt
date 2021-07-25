package com.project.helloworld.homework4

/**
 * Title: Homework Assignment #4: Control Flow
 * From: Pirple/Nirmish
 *
 * Details: Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz".
 *
 * Extra Credit: Instead of only printing "fizz", "buzz", and "fizzbuzz", add a fourth print statement: "prime".
 * You should print this whenever you encounter a number that is prime (divisible only by itself and one).
 */

fun main(){
    (1..100).forEach {
        val output = when {
            it.divisibleBy(15) -> "FizzBuzz"
            it.divisibleBy(3) -> "Fizz"
            it.divisibleBy(5) -> "Buzz"
            isPrime(it)-> "Prime"
            else -> "$it"
        }
        println(output)
    }
}

fun Int.divisibleBy(num: Int) = this.rem(num) == 0

fun isPrime(num: Int) = num >= 2 && (2..(num.div(2))).none { num.rem(it) == 0 }