package calculator.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DividerTest {
    @Test
    fun `쉼표나 콜론이 들어올 때 문자열을 분리한다`() {
        val input = "1,2:3"
        val stringList = Divider().stringDivide(input)
        val expectation = listOf("1", "2", "3")
        assertEquals(stringList, expectation)
    }

    @Test
    fun `커스텀 문자가 들어오면 문자열을 분리한다`() {
        val input = "//v:\\n1,2:3v:4"
        val stringList = Divider().stringDivide(input)
        val expectation = listOf("1", "2", "3", "4")
        assertEquals(stringList, expectation)
    }
}