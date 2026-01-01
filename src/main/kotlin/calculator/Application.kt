package calculator

import calculator.model.*
import calculator.view.*

fun main() {
    val input = InputView().readInput()

    if (input.isNullOrBlank()) {
        println("결과 : 0")
        return
    }

    val stringList = Divider().stringDivide(input)
    val intList = Converter().convertStringToInt(stringList)

    println("결과 : ${intList.sum()}")
}
