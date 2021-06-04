package com.learning.springboot-kotlin-h2

import java.lang.IllegalArgumentException

class Calculator {
    fun parse(s: String) : Int {
        val (a, op, b) = s.split(" ")
        
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
        
            else -> throw IllegalArgumentException("Invalid exception")
        }
    }
    fun emptyString (s: String) : Int {
        if (s == "") return 0

    }
    fun singleInput (s: String) : Int {
        if(s==1) return 1

    }

}