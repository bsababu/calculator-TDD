package com.learning.springbootkotlinh2

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class CalculatorTest {
	private val calculator  =Calculator()

	@Test
	fun `Passing single value`() {
		val res = calculator.computeIntegers("1")
		assertEquals(1,res)
	}

	@Test
	fun `Adding two numbers`() {
	    val result = calculator.computeIntegers("2 + 2")
	    assertEquals(4, result)
	}
	@Test
	fun `subtracting two numbers`() {
	    val result = calculator.computeIntegers("2 - 2")
	    assertEquals(0, result)
	}
	@Test

	fun `Multiply two numbers`() {
	    val result = calculator.computeIntegers("3 * 2")
	    assertEquals(6, result)
	}
	@Test
	fun `Dividing two numbers`() = run {
	    val result = calculator.computeIntegers("10 / 5")
	    assertEquals(2, result)
	}
	@Test
	fun `impossible to divide by zero`() {
		val exception = assertThrows<ArithmeticException> ("Impossible to divide by 0") {
			calculator.computeIntegers("1 / 0")
		}
		assertEquals("Impossible to divide by 0", exception.message)
	}
	@Test
	fun `Using different operands`() = run {
		val result = calculator.multipleOperations("100 - 34 * 0")
		assertEquals(100, result)
	}
	@Test
	fun `logarithm of a number`() = run {
		val result = calculator.calculateLogarithm("log 1000")
		assertEquals(3.0,result, "The logs are fine")
	}

}