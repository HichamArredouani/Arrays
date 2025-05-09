import java.util.Arrays;

public class Maximum {
    public static void main (String[] args) {
        int [] numbers = {55, 21, 33, 32, 1};
        int max =  numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Max value is " + max);
    }
}
