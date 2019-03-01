//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Chris Wooden
//Date - February 28, 2019
//Class - AP Computer Science A, Period 4
//Lab  - Big House

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
   	  bigHouse(window);

   }

   public void bigHouse( Graphics window )
   {

   	  //set up house

      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );

      //draw windows

      window.setColor(Color.YELLOW);

      window.fillRect( 250, 300, 50, 50 );

      window.fillRect( 500, 300, 50, 50 );

      //draw door

      window.setColor( Color.WHITE );

      window.fillRect( 350, 300, 100, 300);

      //draw roof

      window.setColor(Color.GREEN);

      window.fillRect( 200, 100, 400, 25);

      window.fillRect( 250, 50, 300, 25);

      window.fillRect( 275, 25, 250, 25);

   }
}