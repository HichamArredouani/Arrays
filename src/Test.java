public class Test {
    public static void main(String[] args) {

        double[] prices = {19.99, 5.49, 13.25, 9.99, 2.50};
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        System.out.println("Total: €" + total);


        String[] cities = {"Paris", "London", "Tokyo"};
        for (String city : cities) {
            System.out.println(city);

            int[] values = {3, 6, 9};
            for (int value : values) {
                System.out.println(value * 2);


            }
        }
    }

}