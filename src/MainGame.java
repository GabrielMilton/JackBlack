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
                //  Deck[x].Printinfo();
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
        Niam.calulateTotal();
        Niam.Printinfo();
        //todo: give dealer card
        //todo: make the calucle totoal for the dealer
        //todo: want to print the dealers info

        //ask the user question

        Scanner S = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = S.nextLine();
        System.out.println(name);
        me.name = name;
        me.Printinfo();
        me.HitorStay();
        if (me.isHit == true) {
            {
                ExtraCards = new Card[3];
                for (int t = 0; t < me.Hand.length; t = t + 1) {
                    ExtraCards[t] = me.Hand[t];
                }
                ExtraCards[2] = Deck[4];
                me.Hand = ExtraCards;
                me.calulateTotal();
            }
            System.out.println("You now have: " + me.Cardtotal);
        }
        me.HitorStay();
        if (me.isHit == true) {
            {
                ExtraCards = new Card[4];
                for (int t = 0; t < me.Hand.length; t = t + 1) {
                    ExtraCards[t] = me.Hand[t];
                }
                ExtraCards[3] = Deck[5];
                me.Hand = ExtraCards;
                me.calulateTotal();
            }
            System.out.println("You now have: " + me.Cardtotal);
        }
        me.HitorStay();
        if (me.isHit == true) {
            {
                ExtraCards = new Card[5];
                for (int t = 0; t < me.Hand.length; t = t + 1) {
                    ExtraCards[t] = me.Hand[t];
                }
                ExtraCards[4] = Deck[6];
                me.Hand = ExtraCards;
                me.calulateTotal();
            }
            System.out.println("You now have: " + me.Cardtotal);
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
