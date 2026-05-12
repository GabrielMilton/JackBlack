import javax.xml.soap.Name;

public class Card {
    public String Suit;
    public int Value;
    public String Name;
    //todo: make a consturuncor that has three parameters one for each vatriable. Set the tinstance varibles accroding to the prapmeters
    //todo: make a print info that prints the info of the card
    public Card(int psuit,int pvalue,int pName){
        if(psuit == 0){
            Suit = "hearts";
        }
        else if(psuit == 1){
            Suit = "Dimamonds";
        }
        if(psuit == 2){
            Suit = "clubs";
        }
        else if(psuit == 3){
            Suit = "Spades";
        }

        Value = pvalue;
        Name = "Ace";

        if (pName == 0){
            Name = "Ace";
            Value = 1;
        }
        else if(pName == 1){
            Name = "two";
            Value = 2;
        }
        else if(pName == 2){
            Name = "three";
            Value = 3;
        }
        else if(pName == 3){
            Name = "four";
            Value = 4;
        }
        else if(pName == 4){
            Name = "five";
            Value = 5;
        }
        else if(pName == 5){
            Name = "six";
            Value = 6;
        }
        else if(pName == 6){
            Name = "seven";
            Value = 7;
        }
        else if(pName == 7){
            Name = "eight";
            Value = 8;
        }
        else if(pName == 8){
            Name = "nine";
            Value = 9;

        }
        else if(pName == 9){
            Name = "ten";
            Value = 10;
        }
        else if(pName == 10){
            Name = "King";
            Value = 10;
        }
        else if(pName == 11){
            Name = "Queen";
            Value = 10;
        }
        else if(pName == 12){
            Name = "Jack";
            Value = 10;
        }

    }


    public void Printinfo(){
        System.out.println("the " + Name + " of " + Suit + " is worth " + Value + " points" );

    }
}
