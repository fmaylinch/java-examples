package tech.bts.javaexamples.classes.machine.calculator

// The constructor is right next to the class
class CalculatorKotlin (var value: Double) {

    // Fields
    var operationCount: Int = 0
        private set


    // Methods

    fun add(x: Double) {
        this.value += x
        this.operationCount++
    }

    fun divideBy(x: Double) {
        this.value /= x
        this.operationCount++
    }

    /**
     * Resets the value to 0.
     * The operation count is not modified.
     */
    fun clear() {
        this.value = 0.0
    }
}