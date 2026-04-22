package Project;


public class Calculator {
	public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
    	if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
    	}
        return a / b;
    }
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int a = 6;
        int b = 3;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }

}
