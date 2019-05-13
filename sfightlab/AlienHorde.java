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
    aliens = new ArrayList<>();
    for(int i = 1; i <= size; i++) {
      add(new Alien(60*i, 60, 30, 30, 2));
    }
  }

  public void add(Alien al)
  {
    aliens.add(al);
  }

  public void drawEmAll( Graphics window )
  {
    int count = 0;
    for(Alien al : aliens) {
    al.draw(window);
    }
  }

  public void moveEmAll()
  {
    for(Alien al : aliens) {
      al.move();
    }
  }

  public void removeDeadOnes(List<Ammo> shots)
  {
    for(int i = getSize()-1; i >= 0; i--) {
      for(Ammo a : shots) {
          if(a.collided(aliens.get(i))) {
            aliens.remove(i);
            break;
          }
      }
    }
  }

  public boolean gameLost(){
    for (int i = 0; i < aliens.size(); i++){
      if ((aliens.get(i)).getY() >= 575){
        return true;
      }
    }
    return false;
  }

  public int getSize()
  {
    return aliens.size();
  }

  public String toString()
  {
    return super.toString() + " aliens";
  }
}