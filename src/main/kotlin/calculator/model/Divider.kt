package calculator.model

class Divider {
    fun stringDivide(input: String): List<String> {
        var targetString = input
        var customDelimiter: String

        if (input.startsWith("//")
            && input.contains("\\n")){
            val splitIndex = input.indexOf("\\n")
            customDelimiter = input.substring(2, splitIndex)

            targetString = input.substring(splitIndex + 2)
            return targetString.split(customDelimiter, ",", ":")
        }

        return targetString.split(",", ":")
    }
}
