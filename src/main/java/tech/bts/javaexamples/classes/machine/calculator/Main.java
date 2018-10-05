package tech.bts.javaexamples.classes.machine.calculator;

public class Main {

    public static void main(String[] args) {

        // Calculator calc = new Calculator(0);
        CalculatorKotlin calc = new CalculatorKotlin(0);

        calc.add(100);
        calc.clear();

        calc.add(7);
        calc.add(3);
        calc.add(5);

        calc.divideBy(3);

        System.out.println( "Value: " + calc.getValue() );
        System.out.println( "Operations: " + calc.getOperationCount() );
    }
}
