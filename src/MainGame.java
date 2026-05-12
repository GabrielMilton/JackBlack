public class MainGame {
    public Card[] Deck;
    public Player me;
    public Dealer Niam;
    public static void main(String[] args) {
        new MainGame();
    }
    public MainGame(){
        System.out.println("Welcome to Blackjack");
        Deck = new Card[52];
        int Counter = 0;
        for(int y=0; y<4; y=y+1) {//4 suits per deck
            for (int x = 0; x < 13; x++) {//13 cards per suit
                Deck[Counter] = new Card(y, 10, x);
                Counter++;
              //  Deck[x].Printinfo();
            }
        }
        shuffle();
        printdeck();
        me = new Player();
        Niam =new Dealer();
    }

    public void compare(){
    }

    public void round(){
    }

    public void shuffle(){
    for(int o=0; o<Deck.length; o=o+1){
        int randomIndex = (int)(Math.random()*52);
        Card Spencer = Deck[randomIndex];
        Deck[randomIndex] = Deck[o];
        Deck[o] = Spencer;
    }
    }

    public void printdeck(){
        for(int i=0; i<Deck.length; i=i+1){
            Deck[i].Printinfo();
        }
    }
    //todo: make a method that is called shuffle()
    // in the method make a for loop that goes through every card in the deck

}
