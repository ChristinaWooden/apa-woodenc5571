//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack
{
  //add in Player instance variable
  //add in Dealer instance variable

  private ArrayList<Playerable> players;

  public BlackJack(int num)
  {

    players = new ArrayList<Playerable>();
    players.add(new Dealer());
    for (int i = 0; i < num; i++){
      players.add(new Player());
    }


  }

  public void playGame()
  {
    Scanner keyboard = new Scanner(System.in);
    int choice = 0;
    int hit = 0;

    do{

      ((Dealer)(players.get(0))).shuffle();


      for(int i = 1; i < players.size(); i++){
        players.get(i).addCardToHand(((Dealer)(players.get(0))).deal());
        players.get(i).addCardToHand(((Dealer)(players.get(0))).deal());
      }

      players.get(0).addCardToHand(((Dealer)(players.get(0))).deal());
      players.get(0).addCardToHand(((Dealer)(players.get(0))).deal());


      for (int i = 1; i < players.size(); i++){
        System.out.println("\nPlayer \n" + players.get(i).getHandValue() + " " + players.get(i).toString());

        System.out.println("\nPlayer " + i + ":: Do you want to hit? \n 0 = yes \n 1 = no");  
        hit = keyboard.nextInt();

        if(hit == 0){

        //method to play as the player
        do{
          players.get(i).addCardToHand(((Dealer)(players.get(0))).deal());
          System.out.println("\nPlayer " + i + ":: \n"+ i + " " + players.get(i).getHandValue() + " " + players.get(i).toString());
          if (players.get(i).getHandValue() < 21){
            System.out.println("\nPlayer " + i + ":: Do you want to hit? \n 0 = yes \n 1 = no");  
            hit = keyboard.nextInt();
          }
        }while(players.get(i).getHandValue() < 21 && hit == 0);

      }
    }


      //method allowing dealer to play
        do{

          System.out.println("\nDealer \n" + players.get(0).getHandValue() + " " + players.get(0).toString() +"\n");

        }while(players.get(0).hit());

        System.out.println("\nDealer \n" + players.get(0).getHandValue() + " " + players.get(0).toString() +"\n");

      //determine who won

        for (int i = 1; i < players.size(); i++){

        if (players.get(0).getHandValue() > 21 && players.get(i).getHandValue() > 21){
          players.get(0).setWinCount(players.get(0).getWinCount() + 1);
          System.out.println("Both bust - dealer wins!");
        }

        else if (players.get(i).getHandValue() > 21 && players.get(0).getHandValue() < 21){
          players.get(0).setWinCount(players.get(0).getWinCount() + 1);
          System.out.println("Dealer wins - player " + i + " busts!");
        }

        else if (players.get(0).getHandValue() > 21){
          players.get(i).setWinCount(players.get(i).getWinCount() + 1);
          System.out.println("Player wins - dealer busts!");
        }

        else if (players.get(0).getHandValue() == players.get(i).getHandValue()){
          System.out.println("Standoff - Dealer and player " + i + " have the same hand value!");
        }
      
        else if (players.get(0).getHandValue() > players.get(i).getHandValue()){
          System.out.println("Dealer has larger hand value!");
          players.get(0).setWinCount(players.get(0).getWinCount() + 1);
        }

        else if (players.get(0).getHandValue() < players.get(i).getHandValue()){
          players.get(i).setWinCount(players.get(i).getWinCount() + 1);
          System.out.println("Player " + i + " has larger hand value!");
        }

        System.out.println("\n\nDealer has won " + players.get(0).getWinCount() + " times" + "\nPlayer " + i + " has won " + players.get(i).getWinCount() + " times");
        }


      System.out.println("Do you want to play again? \n 0 = yes \n 1 = no \n \n ");
        choice = keyboard.nextInt();

      //reset the game
        for (int i = 1; i < players.size(); i++){
          players.get(i).resetHand();
        }
        players.get(0).resetHand();




      }while(choice == 0);



  }
        
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number of players :: ");
    int num = keyboard.nextInt();
    BlackJack game = new BlackJack(num);
    game.playGame();
  }
}