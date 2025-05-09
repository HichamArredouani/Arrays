import java.util.Arrays;

public class Strings {
    public static void main (String[] args) {
        String[] names= {"Hicham", "Bouchra", "Hicham", "Bouchra", "Hicham"};
        String target = "Bouchra";
        int count = 0;

        for (String name : names) {
            if (name.equals(target)) {
                count++;
            }
        }

        System.out.println(target + " comes " + count + " times");
    }
}
