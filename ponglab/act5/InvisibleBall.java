//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class InvisibleBall extends Ball
{

   //constructors
   public InvisibleBall()
   {
   	super();
   }

   public InvisibleBall(int x, int y)
   {
	   super(x,y);
   }

   public InvisibleBall(int x, int y, int w, int h)
   {
	super(x, y, w, h);
   }

   public InvisibleBall(int x, int y, int w, int h, int xSpd, int ySpd)
   {
	super(x,y, w, h, xSpd, ySpd);
   }

   public InvisibleBall(int x, int y, int w, int h, Color col, int xSpd, int ySpd)
   {
		super (x, y, w, h, col, xSpd, ySpd);
   }

   public Color changeColor()
   {
   	int m = (int)(Math.random());
      if (m == 1){
         return new Color (255, 255, 255);
      }	
 		else return new Color(0, 0 ,255);
   }

   public void moveAndDraw(Graphics window)
   {

	   super.setColor(changeColor());
	   super.moveAndDraw(window);

   }
}