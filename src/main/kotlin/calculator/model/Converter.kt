package calculator.model

class Converter {
    fun convertStringToInt(stringList: List<String>): List<Int> {
        val intList = stringList.map { it.toIntOrNull() ?: throw IllegalArgumentException() }
        intList.forEach { i ->
            if (i < 0)
               throw IllegalArgumentException()
        }

        return intList
    }
}
