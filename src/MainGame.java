import javax.swing.*;
import java.util.Scanner;

public class MainGame {
    public Card[] Deck;
    public Card[] ExtraCards;
    public Player me;
    public Dealer Niam;

    public static void main(String[] args) {
        new MainGame();
    }

    public MainGame() {
        System.out.println("Welcome to Blackjack");
        Deck = new Card[52];
        int Counter = 0;
        for (int y = 0; y < 4; y = y + 1) {//4 suits per deck
            for (int x = 0; x < 13; x++) {//13 cards per suit
                Deck[Counter] = new Card(y, 10, x);
                Counter++;

            }
        }
        shuffle();
        printdeck();

        me = new Player();
        Niam = new Dealer();
        //todo: give the cards to the dealer and player
        me.Hand[0] = Deck[0];
        me.Hand[1] = Deck[1];
        me.calulateTotal();

        Niam.Hand[0] = Deck[2];
        Niam.Hand[1] = Deck[3];

        int Counting;
        //todo: give dealer card
        //todo: make the calucle totoal for the dealer
        //todo: want to print the dealers info

        //ask the user question
        System.out.println("Dealer: Niam " + "\n" + "Niam has " + Niam.Hand[0].Value);
        Scanner S = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = S.nextLine();
        System.out.println(name);
        me.name = name;
        me.Printinfo();
        me.HitorStay();
        /*/if (me.isHit == true) {
            ExtraCards = new Card[3];
            for (int t = 0; t < me.Hand.length; t = t + 1) {
                ExtraCards[t] = me.Hand[t];
            }
            ExtraCards[2] = Deck[4];
            me.Hand = ExtraCards;
            System.out.println("You now have: " + me.Cardtotal);

        }/*/
//todo: Add a counter for the dealer to check how many cars ot gabe out and increasde by one
        while (me.isHit == true) {
            ExtraCards = new Card[me.Hand.length + 1];
            for (int t = 0; t < me.Hand.length; t = t + 1) {
                ExtraCards[t] = me.Hand[t];
            }
            ExtraCards[me.Hand.length] =  Deck[4];
            me.Hand = ExtraCards;
            me.HitorStay();
            // code block to be executed
        }




        if (me.isHit == false) {
            {
                System.out.println("The dealer's amount is " + Niam.Cardtotal);
                if (Niam.Cardtotal < 16) {
                    ExtraCards = new Card[3];
                    for (int t = 0; t < Niam.Hand.length; t = t + 1) {
                        ExtraCards[t] = Niam.Hand[t];
                    }
                    ExtraCards[2] = Deck[4];
                    Niam.Hand = ExtraCards;
                    System.out.println("The dealer has under 16 and decided to hit and now they have " + Niam.Cardtotal);
                }
                if (Niam.Cardtotal > 16) {
                    System.out.println("The dealer has over 16 and doesn't want t");
                }
            }

        }
    }

    public void compare() {
        System.out.println("The Dealer has a value of: " + Niam.Cardtotal);
        if (me.Cardtotal >= 21) {
            me.isBust = true;
            System.out.println("You Busted! " + "\n" +  "You lost!");
        }
        if (me.Cardtotal < Niam.Cardtotal){
            System.out.println("The dealer has a higher number than you! " + "\n" +  "You lost!");
        }

        if (me.Cardtotal <= 21) {
            me.isBust = false;
            System.out.println("You are under 21! " + "\n" +  "You Won!");
        }
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