import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Player extends AbstractPlayer{

	//constructors
	public Player(){
		super();
	}

	public Player(ArrayList<Card> h){
		super(h);
	}

	public Player(int w){
		super(w);
	}

	public Player(ArrayList<Card> h, int w){
		super(h,w);
	}


	//hit method
	public boolean hit(){
		addCardToHand(new BlackJackCard());
		return getHandValue() < 21;
	}
}
