package calculator.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConverterTest {
    @Test
    fun `문자열 리스트를 숫자로 변환한다`() {
        val stringList = listOf("1", "2", "3")
        val expectation = listOf(1, 2, 3)

        val intList = Converter().convertStringToInt(stringList)

        assertEquals(intList, expectation)
    }
}
