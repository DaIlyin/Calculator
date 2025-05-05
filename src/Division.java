public class Division implements Strategy{

    @Override
    public int calculate(Integer[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0){
                result /= numbers[i];
            } else {
                System.out.println("Division by zero");

            }
        }
        return result;
    }
}

