package com.learning.springbootkotlinh2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {

	val calculator  =Calculator()
	@Test
	fun testEmptyString () {
		val result = calculator.emptyString("")
		assertEquals(0, result)
	}
	@Test
	fun testSingleValue () {
		val res = calculator.singleDigit("1")
		assertEquals(1,res)
	}
	@Test
	fun testAddition () {
	    val result = calculator.kalculator("2 + 2")
	    assertEquals(4, result)

	}
	@Test
	fun testSubstract () {
	    val result = calculator.kalculator("2 - 2")
	    assertEquals(0, result)
	}
	@Test
	fun multiply() {
	    //val calculator  = Calculator()
	    // println("Testing...")
	    val result = calculator.kalculator("3 * 2")
	    assertEquals(6, result)
	}
	@Test
	fun testDevision () {
	    val result = calculator.kalculator(s = "10 / 5")
	    assertEquals(2, result)
	}
	@Test
	fun testModule_Log () {
	    val result = calculator.calclate_log("log 27")
	    assertEquals(1.431, result)
	}
}