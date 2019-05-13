//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
  private int speed;

  public Ammo()
  {
    this(0,0,0);
  }

  public Ammo(int x, int y)
  {
    this(x,y,0);
  }

  public Ammo(int x, int y, int s)
  {
    super(x,y,10, 10);
    speed = s;
  }

  public void setSpeed(int s)
  {
    speed = s;
  }

  public int getSpeed()
  {
    return speed;
  }

  public void draw( Graphics window )
  {
    window.fillRect(getX(),getY(),10,10);
  }
        
  public void move( String direction )
  {
    if(direction.equals("UP")) {
      setY(getY() - getSpeed());
    }
    if(direction.equals("DOWN")) {
      setY(getY() + getSpeed());
    }
    if(direction.equals("LEFT")) {
      setX(getX() - getSpeed());
    }
    if(direction.equals("RIGHT")) {
      setX(getX() + getSpeed());
    }
  }

  public boolean collided(Alien al)
  {
    if (getX() + 10 >= al.getX() && getX() <= al.getX() + al.getWidth()
            && getY() - 10 >= al.getY()
            && getY() <= al.getY() + al.getHeight()) {
      return true;
    } else {
      return false;
    }
  }

  public String toString()
  {
    return super.toString() + getSpeed();
  }
}