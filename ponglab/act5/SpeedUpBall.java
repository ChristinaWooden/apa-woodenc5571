//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

  //instance variables
  private int xSpeed;
  private int ySpeed;

  public SpeedUpBall()
  {
  	super();
  }

  public SpeedUpBall(int x, int y)
  {
  	super(x,y);
  }


  public SpeedUpBall(int x, int y, int xSpd, int ySpd)
  {
  	super(x,y,xSpd,ySpd);
  }

  public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
  {
  	super(x,y,wid,ht,xSpd,ySpd);
  }


  public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
  {
  	super(x,y,wid,ht,col,xSpd,ySpd);
  }

  public void setXSpeed( int xSpd )
  {
  	xSpeed = (int)(Math.random()*xSpd);
    if (super.getX() + xSpeed >= 550 || super.getX() + xSpeed <= 0){
        xSpeed = (-xSpeed);
    }
  }

  public void setYSpeed( int ySpd )
  {
  	ySpeed = (int)(Math.random()*ySpd);
    if (super.getY() + ySpeed >= 600 || super.getY() + ySpeed <= 0){
      ySpeed = (-ySpeed);
    }
  }

}

