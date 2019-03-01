//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
  public Robot()    //constructor method - sets up the class
  {
    setSize(800,600);
    setBackground(Color.WHITE);   	
    setVisible(true);
  }
  
  public void paint( Graphics window )
  {
    window.setColor(Color.BLUE);
    
    window.drawString("Robot LAB ", 35, 35 );
    
    head(window);

    upperBody(window);

    lowerBody(window);
    
  }
  
  public void head( Graphics window )
  {
    window.setColor(Color.YELLOW);
    
    window.fillOval(300, 100, 200, 100);
    
    window.setColor(Color.BLACK);

    window.fillOval(350, 150, 30, 30);

    window.fillOval(400, 150, 30, 30);
    //add more code here
    
  }

  public void upperBody( Graphics window )
  {
    window.setColor(Color.BLUE);

    window.fillRect(250, 200, 330, 200);
  }

  public void lowerBody( Graphics window )
  {
    window.setColor(Color.BLACK);

    //draw arms
    window.fillRect(100, 225, 150, 1);

    window.fillRect(480, 225, 150, 1);

    //draw legs
    window.fillRect(270, 400, 1, 75);

    window.fillRect(310, 400, 1, 75);
    
  }
}
