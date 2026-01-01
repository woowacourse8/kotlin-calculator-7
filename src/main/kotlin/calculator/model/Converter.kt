package calculator.model

class Converter {
    fun convertStringToInt(stringList: List<String>): List<Int> {
        return stringList.map {
            val number = it.toIntOrNull() ?: throw IllegalArgumentException()
            require (number >= 0)
            number
        }
    }
}
