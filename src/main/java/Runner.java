public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        assertEqual(calculator.sum(2, 2), 4, "sum");
        assertEqual(calculator.subtract(4, 2), 2, "subtract");
        assertEqual(calculator.multiply(4, 2), 8, "multiply");
        assertEqual(calculator.divide(4, 2), 2, "divide");
    }

    public static void assertEqual(int actual, int expected, String methodName) {
        if (actual == expected) {
            System.out.printf("Метод %s работает правильно\n", methodName);
        } else {
            System.out.printf("Метод %s работает неправильно\n", methodName);
        }
    }
}








