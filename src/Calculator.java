
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private final static Map<String, Strategy> operations = buildStrategies();

    private static Map<String, Strategy> buildStrategies() {
        return Map.of("сложение", new Addition(),"вычитание", new Subtraction(), "деление", new Division(), "умножение", new Multiplication());
    }

    private static void strategyChoice(String operation, Integer[] numbers) {
        System.out.println(operations.get(operation).calculate(numbers));
    }

    public static void main(String[] args) {
        System.out.println("Калькулятор, введите операцию и числа через пробел. Доступные операции: \nсложение \nвычитание \nделение \nумножение");
        try (Scanner scanner = new Scanner(System.in)) {
            String input  = scanner.nextLine();
            String[] arrays = input.split(" ");
            String operation = arrays[0];
            Integer[] numbers = new Integer[arrays.length - 1];
            for (int i = 1; i < arrays.length; i++) {
                numbers[i - 1] = Integer.parseInt(arrays[i]);
            }
            strategyChoice(operation, numbers);
        }
    }
}
