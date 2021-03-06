package ua.begem.bl;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return result;
    }
}
