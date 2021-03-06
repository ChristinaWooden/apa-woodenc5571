// A+ Computer Science  -  www.apluscompsci.com
//Name - Chris Wooden
//Date -
//Class - APCSA Whitehouse
//Lab  - Pong

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable
{
  private Ball ball;

  public BallTestTwo()
  {
    setBackground(Color.white);
    setVisible(true);

    ball = new Ball(50,50,3,3);  
    ball = new Ball(100,350,10,10,Color.RED);   
    ball = new Ball(200,90,10,10,Color.BLUE);
    ball = new Ball(300,10,10,10,Color.GREEN); 

    new Thread(this).start();
  }
  
  public void update(Graphics window)
  {
    paint(window);
  }

  public void paint(Graphics window)
  {
    ball.moveAndDraw(window);

    if(!(ball.getX()>=10 && ball.getX()<=550))
    {
      ball.setXSpeed(-ball.getXSpeed());
    }

    if(!(ball.getY()>=10 && ball.getY()<=450))
    {
      ball.setYSpeed(-ball.getYSpeed());
    }
  }
  
   public void run()
   {
    try
    {
      while(true)
      {
         Thread.currentThread();
         Thread.sleep(19);
            repaint();
         }
      }catch(Exception e)
      {
      }
    } 
}