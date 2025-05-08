import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8ball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Lijst met Magic 8-ball antwoorden
        ArrayList<String> antwoorden = new ArrayList<>();
        antwoorden.add("It is certain");
        antwoorden.add("It is decidedly so");
        antwoorden.add("Without a doubt");
        antwoorden.add("Yes - definitely");
        antwoorden.add("You may rely on it");
        antwoorden.add("As I see it, yes");
        antwoorden.add("Most likely");
        antwoorden.add("Outlook good");
        antwoorden.add("Yes");
        antwoorden.add("Signs point to yes");
        antwoorden.add("Reply hazy, try again");
        antwoorden.add("Ask again later");
        antwoorden.add("Better not tell you now");
        antwoorden.add("Cannot predict now");
        antwoorden.add("Concentrate and ask again");
        antwoorden.add("Don’t count on it");
        antwoorden.add("My reply is no");
        antwoorden.add("My sources say no");
        antwoorden.add("Outlook not so good");
        antwoorden.add("Very doubtful");

        System.out.println("🎱 Welkom bij de Magic 8-ball! 🎱");
        System.out.print("Stel je vraag: ");
        String vraag = scanner.nextLine();  // Gebruikersvraag (we doen hier verder niets mee)

        // Willekeurig antwoord kiezen
        int randomIndex = random.nextInt(antwoorden.size());
        String antwoord = antwoorden.get(randomIndex);

        // Antwoord tonen
        System.out.println("\n🔮 Het antwoord op je vraag is: " + antwoord);

        scanner.close();
    }
}