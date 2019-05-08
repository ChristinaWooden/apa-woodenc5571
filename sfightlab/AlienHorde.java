//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
  private List<Alien> aliens;

  public AlienHorde(int size)
  {
    aliens = new ArrayList<Alien>();

    for (int i = 0; i < size; i++){
      aliens.add(new Alien());
    }

  }

  public void add(Alien al)
  {
    aliens.add(al);
  }

  public void drawEmAll( Graphics window )
  {
    for (int i = 0; i < aliens.size(); i++){
      item.draw(window);
    }
  }

  public void moveEmAll()
  {
  }

  public void removeDeadOnes(List<Ammo> shots)
  {
  }

  public String toString()
  {
    return "";
  }
}
