package tech.bts.javaexamples.classes.machine.calculator;

public class Calculator {

    // Fields
    private double value;
    private int operationCount;

    // Constructor
    public Calculator(double value) {
        this.value = value;
        this.operationCount = 0;
    }

    // Methods

    public void add(double x) {
        this.value += x;
        this.operationCount++;
    }

    public void divideBy(double x) {
        this.value /= x;
        this.operationCount++;
    }

    /**
     * Resets the value to 0.
     * The operation count is not modified.
     */
    public void clear() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public int getOperationCount() {
        return operationCount;
    }
}
