class Card {
    protected String suit;
    protected String name;
    protected int value;

    /**
     *
     * @param: int s (1-4 suit value)
     * @param: int v (1-13 face value)
     *
     **/

    Card(int s, int v) {
        this.suit = genSuit(s);
        this.name = genName(v);
        this.value = (value < 11) ? value : 10;
    }

    /**
     *
     * @param: int s
     *
     **/
    private String genSuit(int s) {
        String currentSuit;

        switch (s) {
            case 1:
                currentSuit = "Spades";
                break;
            case 2:
                currentSuit = "Hearts";
                break;
            case 3:
                currentSuit = "Clubs";
                break;
            default:
                currentSuit = "Diamonds";
        }

        return currentSuit;
    }

    /**
     * 
     * @param: int v
     *
     */

    private String genName(int v) {
        String currentName;

        if (v == 1) {
            currentName = "Ace";
        } else if (v < 11) {
            currentName = String.valueOf(v);
        } else {
            switch (v) {
                case 11:
                    currentName = "Jack";
                    break;
                case 12:
                    currentName = "Queen";
                    break;
                default:
                    currentName = "King";

            }
        }
        return currentName;
    }

    /**
     * Getter!
     */
    public int getValue() {
        return this.value;
    }
}