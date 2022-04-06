import java.util.ArrayList;

public class Blackjack {

    public static void main(String[] args) {
        ArrayList<Card> singleDeck = new ArrayList<>();

        newDeck(singleDeck);

        Player dealer = new Player(singleDeck);

        System.out.println("Dealer is showing " + dealer.hand.get(0).name + " of " + dealer.hand.get(0).suit);

        Player player = new Player(singleDeck);
        System.out.println("Player has " + player.hand.get(0).name + " of " + player.hand.get(0).suit + " and "
                + player.hand.get(1).name + " of " + player.hand.get(1).suit);
        System.out.println("Player hand value: " + player.getTotal(player.hand));

        // to do:
        // generate hand
        // "pop" dealt cards from deck
        // logic around hit/stand/dealer hand
        // win/lose logic -- player class to keep track of points

    }

    /**
     * Function: newDeck()
     * @param ArrayList<Card> deck
     * @return void
     * 
     * purpose: Generates new deck
     * 
     */
    public static void newDeck(ArrayList<Card> deck) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                Card c = new Card(i, j);
                deck.add(c);
            }
        }
    }
    
    

}
