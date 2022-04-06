import java.util.ArrayList;
import java.util.Random;

public class Player {
    ArrayList<Card> hand = new ArrayList<>();
    protected int wins;
    protected int losses;
    protected int total;

    Player(ArrayList<Card> deck) {
        getCard(deck, hand);
        getCard(deck, hand);
        this.total = getTotal(hand);
    }

    protected void getCard(ArrayList<Card> deck, ArrayList<Card> hand) {
        Random i = new Random();
        int cardIndex = i.nextInt(deck.size());
        Card card = deck.get(cardIndex);
        hand.add(card);
        deck.remove(card);
    }

    /**
     * 
     * @Function: getTotal()
     * @param: ArrayList<Card> hand
     * @return int total (value of hand)
     * 
     * Purpose: gets total value of hand
     * 
     */
     int getTotal(ArrayList<Card> hand) {
        int total = 0;
        int countOfAces = 0;

        // Working around Ace logic
        // TODO: Come up with hand sorting method
        // TODO: Sort hand descending according to value
        // TODO: Calculate value of ace based on number of aces
        // and prior total
        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);

            if (current.name.equals("Ace")) {
                countOfAces++;
                total = (total + 11 > 21) ? total + 1 : total + 11;
            } else {
                total += current.getValue();
                System.out.println("HERE: TOTAL IS ADDING " + current.getValue() + " TO " + total);
            }
        }

        return total;
    }
}
