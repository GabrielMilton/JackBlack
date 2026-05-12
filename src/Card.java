import javax.xml.soap.Name;

public class Card {
    public String Suit;
    public int Value;
    public String Name;
    //todo: make a consturuncor that has three parameters one for each vatriable. Set the tinstance varibles accroding to the prapmeters
    //todo: make a print info that prints the info of the card
    public Card(String psuit,int pvalue,int pName){
        Value = pvalue;
        Suit = psuit;
        Name = "Ace";
        if (pName == 0){
            Name = "Ace";
            Value = 11;
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
    }


    public void Printinfo(){
        System.out.println("the " + Name + " of " + Suit + " is worth " + Value + " points" );

    }
}
