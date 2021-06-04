import org.junit.Test
import kotlin.test.assertEquals
class Calculator {

    @Test
    fun multiply2By2 () {
        val calculator  = Calculator()
        val result = calculator.parse(s: "2 * 2")
        assertEquals(expexted:4, result)

    }
    @Test
    fun testDevide2By2 () {
        val calculator  = Calculator()
        val result = calculator.parse(s: "2 / 2")
        assertEquals(expexted:1, result)

    }
    @Test
    fun testMinus2By2 () {
        val calculator  = Calculator()
        val result = calculator.parse(s: "2 - 2")
        assertEquals(expexted:0, result)

    }
    @Test
    fun testPlus2By2 () {
        val calculator  = Calculator()
        val result = calculator.parse(s: "2 + 2")
        assertEquals(expexted:4, result)

    }
    @Test
    fun testEmptyString () {
        val calculator  = Calculator()
        val result = calculator.emptyString(s: " ")
        assertEquals(expexted:0, result)

    }
    @Test
    fun testsingleDigit () {
        val calculator  = Calculator()
        val result = calculator.singleInput(s: "1")
        assertEquals(expexted:1, result)

    }
}