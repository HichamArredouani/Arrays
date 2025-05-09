public class Sum {
    public static void main (String[] args) {
         int [] numbers = {3,5,7,9,11};
         int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

        sum += numbers[i];
}
System.out.println("Total sum :" + sum);
    }
}
