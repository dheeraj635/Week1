import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();
        sc.close();

        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);
        printPlayersCards(distributedCards);
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        String[][] distributedCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributedCards[i][j] = deck[index++];
            }
        }
        return distributedCards;
    }

    public static void printPlayersCards(String[][] distributedCards) {
        for (int i = 0; i < distributedCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : distributedCards[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
