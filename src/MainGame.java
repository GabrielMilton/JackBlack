public class MainGame {
    public Card[] Deck;
    public String Player;
    public String Dealer;
    public static void main(String[] args) {
        new MainGame();
    }
    public MainGame(){
        System.out.println("Welcome to Blackjack");
        Deck = new Card[52];
        for(int x=0; x<13; x++){
            Deck[x] = new Card("Dimonds",10,x);
            Deck[x].Printinfo();
        }
    }

    public void compare(){
    }

    public void round(){
    }

    public void shuffle(){

    }

}
