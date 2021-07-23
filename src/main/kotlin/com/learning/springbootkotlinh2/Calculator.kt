package com.learning.springbootkotlinh2

import java.lang.IllegalArgumentException

class Calculator {
    fun kalculator(s: String) : Int {
        var (a, op, b) = s.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
             "/" -> a.toInt() / b.toInt()
             "+" -> a.toInt() + b.toInt()
             "-" -> a.toInt() - b.toInt()
             "1" ->  1
            else -> throw IllegalArgumentException("Invalid exception")
        }
    }

    fun emptyString (s: String) : Int {
        return 0
        }
        
    }