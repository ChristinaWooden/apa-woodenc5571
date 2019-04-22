//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
  private int xSpeed;
  private int ySpeed;

  public Ball()
  {
    super(200,200);
    xSpeed = 3;
    ySpeed = 1;
  }

  //add the other Ball constructors
  
  public Ball(int x, int y){
  	super(x,y);
    xSpeed = 3;
    ySpeed = 1;
  } 

  public Ball(int x, int y, int e, int f){
  	super(x,y, e, f);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y, int w, int z, Color c){
  	super(x, y, w, z, c);
    xSpeed = 3;
    ySpeed = 1;
  }

  public Ball(int x, int y, int w, int q, Color c, int e, int f){
  	super(x,y,w,q,c);
  	xSpeed = e;
  	ySpeed = f;
  }
   
           
  //add the set methods

  public void setXSpeed(int x){
  	xSpeed = x;
  }

  public void setYSpeed(int y){
  	ySpeed = y;
  }
   

  public void moveAndDraw(Graphics window)
  {
    //draw a white ball at old ball location
  	draw(window, Color.white);

    setX(getX()+xSpeed);
    //setY
    setY(getY()+ySpeed);

    //draw the ball at its new location

    draw(window, Color.BLUE);

  }
   
  public boolean equals(Object obj)
  {
  	if (super.equals(obj)){
  		if (((Ball)obj).getXSpeed() == xSpeed){
  			if (((Ball)obj).getYSpeed() == ySpeed){
  				return true;
  			}
  		}
  	}
    return false;
  }   

  //add the get methods

  public int getXSpeed(){
  	return xSpeed;
  }

  public int getYSpeed(){
  	return ySpeed;
  }

  //add a toString() method
  public String toString(){
  	return super.toString() + ", xSpeed = " + xSpeed + ", ySpeed = " + ySpeed;
  }
}