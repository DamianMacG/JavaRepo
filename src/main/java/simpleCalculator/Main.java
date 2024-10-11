package simpleCalculator;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(100);
        calculator.setSecondNumber(10);
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getSubtractionResult());
        System.out.println(calculator.getSubtractionResult());
    }
}
