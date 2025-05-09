import java.util.Arrays;


public class Replace {
    public static void main(String[] args) {
        int[] Numbers = {8, -9, 10, -7, 3, -8};

        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] < 0) {
                Numbers[i] = 0;
            }
        }
    System.out.println("Updated array: " + Arrays.toString(Numbers));
    }
}

