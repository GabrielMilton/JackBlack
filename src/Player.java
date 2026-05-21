import java.util.Scanner;
//todo: ADD another arrray tht copies the hand arry and adds one more to it

public class Player {
    public int Cardtotal;
    public boolean isBust;
    public boolean isHit;
    public Card[] Hand;
    public String name;

    public Player(){
        Cardtotal = 2;
        isBust = false;
        isHit = false;
        Hand = new Card[2];
        name = "me";
    }
    public void hit(){
        Scanner S = new Scanner(System.in);
        System.out.println("Hit OR Stay?");
        String Hit = S.nextLine();
        if(Hit.equals("Hit")){
            isHit = true;
        }
    }

    public void stand(){
    }

    public void Printinfo(){
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

