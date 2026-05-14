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
        System.out.println( " Chose to hit: " +  isHit);
        System.out.println("name: " + name);
        System.out.println("cardtotal " + Cardtotal);
        System.out.println( "bust: " + isBust);
        for(int a=0; a<Hand.length; a=a+1){
            Hand[a].Printinfo();
        }
    }
    //todo: make a method called caluclate totoal

    public void calulateTotal(){
        Cardtotal = 0;
        for(int v=0; v<Hand.length; v=v+1){
            Cardtotal += Hand[v].Value;

        }
    }
}

