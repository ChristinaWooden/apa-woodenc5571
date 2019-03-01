//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here

      window.setColor(Color.BLACK);
      window.fillOval ( 220, 150, 30, 30 );
      window.fillOval ( 530, 150, 30, 30 );

      window.setColor(Color.GREEN);
      window.fillOval ( 400, 360, 50, 50 );

      window.setColor(Color.RED);
      window.drawArc(210, 200, 400, 200, -150, 120);


   }
}