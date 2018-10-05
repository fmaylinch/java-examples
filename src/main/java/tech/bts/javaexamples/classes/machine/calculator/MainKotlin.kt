package tech.bts.javaexamples.classes.machine.calculator

fun main(args: Array<String>) {

    val calc = Calculator(0.0)
    // val calc = CalculatorKotlin(0.0)

    calc.add(100.0)
    calc.clear()

    calc.add(7.0)
    calc.add(3.0)
    calc.add(5.0)

    calc.divideBy(3.0)

    // calc.value = 7.0
    // calc.operationCount = 7

    println( "Value: ${calc.value}")
    println( "Count: ${calc.operationCount}")
}