public class Temperatures {
    public static void main(String[] args) {
        double[] temps = {18.0, 24.0, 16.0, 23.0, 31.0};

        for (double celsius : temps) {
            double fahreinheit = celsius * 1.8 + 32;

            System.out.println(fahreinheit);
        }
    }
}