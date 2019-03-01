//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		//finish this constructor
   }


   public void draw(Graphics window)
   {
      window.setColor(Color.RED);

      window.fillRect(500, 500, 80, 80);

      window.setColor(Color.BLUE);
      window.fillRect(525, 525, 30, 30);
      window.setColor(Color.GREEN);
      window.fillOval(525, 525, 30, 30);

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}