package exercises.java.Enums;

public class Switch_Iterate {

	public static void main(String[] args)
	  {
		//iterate the enum
	    for (CardSuit suit: CardSuit.values())
	    {
	      printSuits(suit);
	    }
	  }
	
	public static void printSuits(CardSuit suit){
		//switch and cases
		switch(suit){
		case Clubs: System.out.println("Clubs"); break;
		case Diamonds: System.out.println("Diamonds"); break;
		case Spades: System.out.println("Spades"); break;
		case Hearts: System.out.println("Hearts"); break;
		}
	}
}
