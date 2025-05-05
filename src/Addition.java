public class Addition implements Strategy {

    @Override
    public int calculate(Integer[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
}
