package com.learning.springbootkotlinh2

import java.lang.IllegalArgumentException
import java.math.BigInteger
import kotlin.math.log10
import java.lang.Double.parseDouble


//1: use regex : [] :> multiple_operations methods
//3: encapsulate : class calculator


class Calculator {

    private fun singleValue(s: String): Int {
       return when (s) {
           s -> s.toInt()
           "0" -> 0
           "+" -> 0
           "-" -> 0
           "*" -> 0
           "/" -> 0
           "=" -> 0
           else -> throw IllegalArgumentException("Invalid exception")
       }
    }


    fun computeIntegers(s: String): Int {
        val expr = s.matches("/^(\\d+[\\+\\-\\*\\/]{1})+\\d+\$/g".toRegex())
        if (!expr) {
            return if (s.length <= 1) {
                singleValue(s)
            } else {
                val (a, op, b) = s.split(" ")
                when (op) {
                    "+" -> a.toInt() + b.toInt()
                    "-" -> a.toInt() - b.toInt()
                    "*" -> a.toInt() * b.toInt()
                    "/" -> {
                        if (b.toInt() == 0) {
                            throw ArithmeticException("Impossible to divide by 0")
                        } else {
                            a.toInt() / b.toInt()
                        }
                    }else -> throw IllegalArgumentException("Invalid exception")
                }
            }
        }else {
            throw IllegalArgumentException("Invalid exception")
        }
    }

    fun multipleOperations(s:String): Int {

        val expr = s.matches("/^(\\d+[\\+\\-\\*\\/]{1})+\\d+\$/g".toRegex())
        if (!expr) {
            return if(s.length <= 1 ) {
                singleValue(s)
            }else {
                val (a, op1, b, op2, c) = s.split(" ")
                if (op1 == "+" && op2 == "+") {
                    a.toInt() + b.toInt() + c.toInt()
                } else if (op1 == "+" && op2 == "-") {
                    a.toInt() + b.toInt() - c.toInt()
                } else if (op1 == "+" && op2 == "/") {
                    a.toInt() + (b.toInt() / c.toInt())
                } else if (op1 == "+" && op2 == "*") {
                    a.toInt() + (b.toInt() / c.toInt())
                } else if (op1 == "-" && op2 == "-") {
                    a.toInt() - b.toInt() - c.toInt()
                } else if (op1 == "-" && op2 == "+") {
                    a.toInt() - b.toInt() + c.toInt()
                } else if (op1 == "-" && op2 == "*") {
                    a.toInt() - (b.toInt() * c.toInt())
                }else {
                    return 0
                }
            }
        } else {
            throw IllegalArgumentException("Invalid exception")
        }
    }

    fun calculateLogarithm (s: String): Double {
        //By default, the base log  is 10
        val (op, b) = s.split(" ")
        //log10=1
        return when (op) {
            "log" -> {
                log10(b.toDouble())
            }
            else -> {
                throw IllegalArgumentException("Invalid exception")
            }
        }
    }
}
