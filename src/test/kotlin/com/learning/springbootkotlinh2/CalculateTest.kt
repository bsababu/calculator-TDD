package com.learning.springbootkotlinh2
import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    val calculator  = Calculator()
    @Test
    fun multiply2By2() {
        //val calculator  = Calculator()
        val result = calculator.kalculator("3 * 2")
        assertEquals(6, result)

    }
    @Test
    fun testDevide2By2 () {

        val result = calculator.kalculator(s = "10 / 5")
        assertEquals(2, result)

    }
    @Test
    fun testMinus2By2 () {
        
        val result = calculator.kalculator("2 - 2")
        assertEquals(0, result)

    }
    @Test
    fun testPlus2By2 () {
        
        val result = calculator.kalculator(" 2 + 2")
        assertEquals(4, result)

    }
    @Test
    fun testsingleDigitOrEmpty() {
        val result = calculator.kalculator("1")
        assertEquals(1, result)

    }
    @Test
    fun testEmptyString () {
        val result = calculator.emptyString(" ")
        assertEquals(0, result)

    }
    
}