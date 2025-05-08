public class Arrays {
    public static void main(String[] args) {
        // Stap 1: Sla de reeks getallen op in een array
        int[] myNums = {1, 2, 3, 4, 5, 6, 7};

        // Stap 2: Maak een lege array voor de kwadraten
        int[] mySquareNums = new int[myNums.length];

        // Stap 3: Gebruik een for-lus om de kwadraten te berekenen
        for (int i = 0; i < myNums.length; i++) {
            mySquareNums[i] = myNums[i] * myNums[i];
        }

        // Stap 4: Schrijf de originele en gekwadrateerde getallen naar de console
        System.out.println("Originele getallen:");
        for (int num : myNums) {
            System.out.print(num + " ");
        }

        System.out.println("\nGekwadrateerde getallen:");
        for (int square : mySquareNums) {
            System.out.print(square + " ");
        }
    }
}

