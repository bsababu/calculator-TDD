package com.learning.springbootkotlinh2

import java.lang.IllegalArgumentException


class Calculator {
    fun emptyString(s: String): Int {
        if (s.length == 0 ) {
           return 0
        }
        return -1
    }
    fun singleDigit(s: String): Int {
        return when(s.toInt()) {
            1 -> 1
            else -> throw IllegalArgumentException("Invalid exception")
        }
    }
    fun kalculator(s: String): Int {
        val (a, op, b) = s.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            else -> throw IllegalArgumentException("Invalid exception")
        }
    }

    fun calclate_log (s: String): Float {
        //By default, for Log ;the base is 10
        //approx: log 7 would be ard 0.8 [== scale up ],
        var (op, b) = s.split(" ")
        var (b_1, b_2) = b.split("")
        var b_1_1 = b_1.toFloat() /1000
        var b_2_1 = b_2.toFloat() /1000
        //log10=1
        return when (op) {
            "log" -> b_1_1 + b_2_1
            else -> throw IllegalArgumentException("Invalid exception")
        }
    }
}