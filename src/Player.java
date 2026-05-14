public class Player {
    public int Cardtotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] Hand;
    public String name;

    public Player(){
        Cardtotal = 2;
        isBust = false;
        isHit = true;
        Hand = new Card[2];
        name = "me";

    }
    public void hit(){
    }

    public void stand(){
    }

    public void Printinfo(){
        System.out.println(name  +  " Chose to hit: " +  isHit + " the cardtotal is: " + Cardtotal + "bust: " + isBust);
    }
}

