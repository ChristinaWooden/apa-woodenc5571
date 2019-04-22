//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
  private int speed;

  public Paddle()
  {
    super(10,300);
    speed = 2;
  }


  //add the other Paddle constructors

  public Paddle(int x, int y)
  {
    super(x, y);
    
    speed = 2;
  }

  public Paddle(int x, int y, int s)
  {
  super(x, y);
  
  speed = s;
  }

  public Paddle(int x, int y, int width, int height)
  {
    super(x, y, width, height);
    speed = 2;
  }

  public Paddle(int x, int y, int width, int height, Color col)
  {
    super(x, y, width, height, col);
    speed = 2;
  }

  public Paddle(int x, int y, int width, int height, int s)
  {
    super(x, y, width, height);
    
    speed = s;
  }
  
  public Paddle(int x, int y, int width, int height, Color col, int s)
  {
    super(x, y, width, height, col);
    
    speed = s;
  }
  

  public void moveUpAndDraw(Graphics window)
  {
      //draw a white box at old paddle location
      if (getY() >= 0){
      draw(window,Color.white);

      setY(getY()-speed);
      
      //draw the paddle at its new location
      draw(window, Color.black);
      }

  }

  public void moveDownAndDraw(Graphics window)
  {
      //draw a white box at old paddle location
      if (getY()+100 <= 600){
      draw(window,Color.white);

      setY(getY()+speed);
      
      //draw the paddle at its new location
      draw(window, Color.black);
    }

  }

  //add get methods
   public int getSpeed(){
    return speed;
   }
   
  //add a toString() method

  public String toString(){
    return super.toString() + ", speed = " + speed;
  }
}