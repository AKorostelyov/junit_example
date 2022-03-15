package calculatorTests;

public class Calculator {


    public Calculator() {
    }

    /**
     * Вычисление результата операции с двумя операндами
     *
     * @param operand1  первый операнд
     * @param operand2  второй операнд
     * @param operation операция
     */
    public double executeOperation(double operand1, double operand2, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0.0) {
                    throw new ArithmeticException("Dividing to 0 is prohibited");
                } else {
                    result = operand1 / operand2;
                }
                break;
            default:
                System.out.println("Operation " + operation + " is not supported!");
                break;
        }

        return result;
    }
}
