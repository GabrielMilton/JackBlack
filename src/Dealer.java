public class Dealer {
    public boolean isOver16;
    public boolean isBust;
    public int Cardtotal;
    public Card[] Hand;

    public Dealer() {
        isOver16 = true;
        isBust = false;
        Cardtotal = 22;
        Hand = new Card[2];

    }

    public void hit() {
    }

    public void stand() {
    }

    public void Printinfo() {
        System.out.println("Dealer: Niam ");
        System.out.println("cardtotal " + Cardtotal);
        System.out.println("Over 16:  " + isOver16);
        System.out.println( "bust: " + isBust);
        for(int a=0; a<Hand.length; a=a+1){
            Hand[a].Printinfo();
        }    }

    public void calulateTotal() {
        Cardtotal = 0;
        for (int v = 0; v < Hand.length; v = v + 1) {
            Cardtotal += Hand[v].Value;

        }
    }
}
