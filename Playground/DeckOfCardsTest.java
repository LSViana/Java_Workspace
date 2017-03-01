package playground;
public class DeckOfCardsTest {
	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		System.out.println("\tOriginal distribution of cards");
		for(int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if(i % 4 == 0)
				System.out.println();
		} System.out.println("\n\tRandomic distribution of cards");
		myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		for(int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if(i % 4 == 0)
				System.out.println();
		}
	}
}