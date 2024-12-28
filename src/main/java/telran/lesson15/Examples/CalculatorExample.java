package telran.lesson15.Examples;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        CalculatorTwo calculatorTwo = (a, b) -> a * b;

        System.out.println(calculator.sum(1, 5));
        System.out.println(calculator.sum(12, 45));

        System.out.println(calculatorTwo.mult(1, 5));
        System.out.println(calculatorTwo.mult(12, 45));
    }
}
