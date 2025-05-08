import java.util.ArrayList;

public class Playincards {
    public static void main(String[] args) {
        // 1. Lijst van speelkaarten
        ArrayList<String> playingCards = new ArrayList<>();

        // 2. De vier suits
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // 3. Waarden van de kaarten
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // 4. Genereer het volledige deck (52 kaarten)
        for (String suit : suits) {
            for (String rank : ranks) {
                playingCards.add(rank + " of " + suit);
            }
        }

        // 5. Print alle kaarten om te controleren
        System.out.println("🃏 Volledig kaartendeck (52 kaarten):");
        for (String card : playingCards) {
            System.out.println(card);
        }
    }
}
