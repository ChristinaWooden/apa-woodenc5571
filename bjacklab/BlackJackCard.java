//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  //constructors

  public BlackJackCard(){
  	super();
  }

  public BlackJackCard(String s){
  	super(s);
  }

  public BlackJackCard(int f){
  	super(f);
  }

  public BlackJackCard(int f, String s){
  	super(f,s);
  }


  public int getValue()
  {
    if(FACES[super.getFace()].equals("ACE")){
    	return 11;
    }
    if(FACES[super.getFace()].equals("QUEEN") || FACES[super.getFace()].equals("JACK") || FACES[super.getFace()].equals("KING")){
    	return 10;
    }
    return super.getFace();
  }
        
}