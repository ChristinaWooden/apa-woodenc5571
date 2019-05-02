//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public abstract class AbstractPlayer implements Playerable
{
   private ArrayList<Card> hand;
   private int winCount;
   private ArrayList<Integer> skip = new ArrayList<Integer>();
   
   //constructors

   public AbstractPlayer(){
    hand = new ArrayList<Card>();
    winCount = 0;
   }

   public AbstractPlayer(ArrayList<Card> h, int w){
    hand = h;
    winCount = w;
   }

   public AbstractPlayer(ArrayList<Card> h){
    hand = h;
    winCount = 0;
   }

   public AbstractPlayer(int w){
    hand = new ArrayList<Card>();
    winCount = w;
   }

 
   public  void addCardToHand(Card card) { 
      hand.add(card);
   }

   public void resetHand(){ 
      hand = new ArrayList<Card>();
   }


   
   //set methods
   public void setWinCount(int w){
    winCount = w;
   }

   //get methods

   public int getWinCount(){
    return winCount;
   }

   public int getHandSize(){
    return hand.size();
   }

   public int getHandValue(){
    int total = 0;
    for (Card c : hand){
      total += c.getValue();
    }
    return total;
   }



   public String toString(){ 
      return "hand = " + hand.toString() + "\n Hand value - " + getHandValue() + " \n Wins - " + winCount;
   }       
}  