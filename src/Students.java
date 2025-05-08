import java.util.ArrayList;
import java.util.Random;

public class Students {
    public static void main (String[] args) {
        // Lijst van medecursisten
        ArrayList<String> cursisten = new ArrayList<>();
        cursisten.add("Gwen");
        cursisten.add("Miguel");
        cursisten.add("Kevin");
        cursisten.add("Britta");
        cursisten.add("Frederik");

        // Voorstellen van alle deelnemers in één regel
        System.out.print("Deelnemers: ");
        for (int i = 0; i < cursisten.size(); i++) {
            System.out.print(cursisten.get(i));
            // Controleer of het niet de laatste deelnemer is
            if (i < cursisten.size() - 1) {
                System.out.print(", "); // Komma toevoegen tussen namen
            }
        }
        System.out.println("."); // Punt toevoegen aan het einde

        // Willekeurige winnaar kiezen
        Random random = new Random();
        int winnaarIndex = random.nextInt(cursisten.size());
        String winnaar = cursisten.get(winnaarIndex);

        // Winnaar aankondigen
        System.out.println("🎉 De winnaar van de lotto is: " + winnaar + " 🎉");
    }
}

