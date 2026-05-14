public class Dealer {
    public boolean isOver16;
    public boolean isBust;
    public int Cardtotal;
    public Card[] Hand;

    public Dealer(){
        isOver16 = true;
        isBust = false;
        Cardtotal = 22;
        Hand = new Card[2];

    }

    public void hit(){
    }

    public void stand(){
    }

    public void Printinfo(){
        System.out.println(" the cardtotal is: " + Cardtotal + "over 16 is: " +   " bust: " + isBust);
    }
}

