import java.util.Arrays;

public class Celsius {
    public static void main (String[] args) {
        double[] celsius = {12.5, 33.3, 29.0, 10.0, 44.2};

        for (double temp: celsius) {
            double fahrenheit = temp * 1.8 +32;
            System.out.println(temp + " °C = " + fahrenheit + " °F");
        }

    }
}
