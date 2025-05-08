import java.util.ArrayList;
import java.util.Scanner;

public class DinnerDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guests = new ArrayList<>();

        // Voeg standaard gasten toe
        guests.add("Ahmed Ibn Taleb");
        guests.add("Abdurrazaq Al Badr");
        guests.add("Maher Al Muaqly");

        // Vraag de gebruiker om extra gasten toe te voegen
        System.out.println("Wil je extra gasten uitnodigen? (ja/nee)");
        String antwoord = scanner.nextLine();

        while (antwoord.equalsIgnoreCase("ja")) {
            System.out.print("Voer de naam van een gast in: ");
            String guestName = scanner.nextLine();
            guests.add(guestName);
            System.out.println("Wil je nog een gast toevoegen? (ja/nee)");
            antwoord = scanner.nextLine();
        }

        // Verstuur uitnodigingen
        System.out.println("\nUitnodigingen:");
        for (String guest : guests) {
            System.out.println("Beste " + guest + ", je bent uitgenodigd voor een exclusief diner!");
        }

        // Maak een reservering
        System.out.println("\nIk zou graag een tafel voor " + guests.size() + " reserveren.");

        scanner.close();
    }
}
