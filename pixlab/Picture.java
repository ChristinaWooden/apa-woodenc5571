import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  public void keepOnlyRed(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }    
    }
  }

  public void keepOnlyGreen(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }    
    }
  }


  public void negate(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }

  public void fixUnderwater(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel pixel = null;
       for ( int row = 0; row < pixels.length; row++ ){
            for ( int col = 0; col < pixels[0].length; col++ ){
                pixel = pixels[row][col];
                pixel.setRed( pixel.getRed() * 4 );
            }
        }
    }
  
  public void grayscale(){
    grayscaleLuminosity();
  }

  public void grayscaleAverage(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray :pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setGrayAverage();
      }
    }   
  }

  public void grayscaleLightness(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray :pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setGrayLightness();
      }
    }   
  }

  public void grayscaleLuminosity(){
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray :pixels){
      for (Pixel pixelObj : rowArray){
        pixelObj.setGrayLuminosity();
      }
    }   
  }

  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }

  public void mirrorVerticalRightToLeft(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = width-1; col > width/2; col--)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }     
  }

  public void mirrorHorizontal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel downPixel = null;
    Pixel upPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++){
      for (int row = 0; row < pixels.length / 2; row++){
        downPixel = pixels[row][col];
        upPixel = pixels[pixels.length - 1 - row][col];
        upPixel.setColor(downPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBotToTop(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel downPixel = null;
    Pixel upPixel = null;
    int width = pixels[0].length;
    for (int col = 0; col < width; col++){
      for (int row = pixels.length-1; row > pixels.length / 2; row--){
        downPixel = pixels[row][col];
        upPixel = pixels[pixels.length - 1 - row][col];
        upPixel.setColor(downPixel.getColor());
      }
    }    
  }

  public void mirrorDiagonal(){
    Pixel[][] pixels = this.getPixels2D();
    Pixel topRightPixel = null;
    Pixel bottomLeftPixel = null;
    int m;
    if (pixels.length < pixels[0].length) { 
      m = pixels.length; 
    }
    else {
      m = pixels[0].length; 
    }
      
    for (int col = 0; col < m; col++){
      for (int row = col; row < m; row++){
        topRightPixel = pixels[row][col];
        bottomLeftPixel = pixels[col][row];
        bottomLeftPixel.setColor(topRightPixel.getColor());
        }
      }
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    //int mirrorPoint = 276;
    //Pixel leftPixel = null;
    //Pixel rightPixel = null;
    //int count = 0;
    //Pixel[][] pixels = this.getPixels2D();
    //int c = 0;
    
    // loop through the rows
    //for (int row = 27; row < 97; row++)
    //{
      // loop from 13 to just before the mirror point
      //for (int col = 13; col < mirrorPoint; col++)
      //{
        
        //leftPixel = pixels[row][col];      
        //rightPixel = pixels[row]                       
          //               [mirrorPoint - col + mirrorPoint];
        //rightPixel.setColor(leftPixel.getColor());
        //c++;
      //}
    //}
    //System.out.println(c);
    mirrorRectangle(27, 13, 97, 276, false);
  }

  public void mirrorArms(){
    //int mirrorPoint = 187;
    //Pixel leftPixel = null;
    //Pixel rightPixel = null;
    //int count = 0;
    //Pixel[][] pixels = this.getPixels2D();
    
    //Loop through cols -- mirror the first arm
    //for (int col = 103; col < 294; col++)
    //{
      // loop from 155 to just before the mirror point
      //for (int row = 155; row < mirrorPoint; row++)
      //{
        
        //leftPixel = pixels[row][col];      
        //rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
         //                [col];
        //rightPixel.setColor(leftPixel.getColor());
      //}
    //}
    mirrorRectangle(155, 103, 187, 294, true);
  }

  public void mirrorGull(){
    //int mirrorPoint = 400;
    //Pixel leftPixel = null;
    //Pixel rightPixel = null;
    //Pixel[][] pixels = this.getPixels2D();
  
    //for (int row = 235; row < 325; row++)
    //{
      // loop from  to just before the mirror point
      //for (int col = 239; col < mirrorPoint; col++)
      //{
        
        //leftPixel = pixels[row][col];      
        //rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        //rightPixel.setColor(leftPixel.getColor());
      //}
    //}
    mirrorRectangle(235, 239, 325, 400, false);
  }
  
  public void mirrorRectangle(int x1, int y1, int x2, int y2, boolean vertical){
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    if (!vertical){
      int mirrorPoint = y2;
      for (int row = x1; row < x2; row++){
        for (int col = y1; col < mirrorPoint; col++){
          leftPixel = pixels[row][col];
          rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
          rightPixel.setColor(leftPixel.getColor());
        }
      }
    }
    else {
      int mirrorPoint = x2;
      for (int col = y1; col < y2; col++){
        for (int row = x1; row < mirrorPoint; row++){
          leftPixel = pixels[row][col];      
          rightPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
          rightPixel.setColor(leftPixel.getColor());
        }
      }
    }
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }  
  }

  public void copy2(Picture fromPic, int startRow, int startCol, int r1, int r2, int c1, int c2)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = r1, toRow = startRow; fromRow < r2 && toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = c1, toCol = startCol; fromCol < c2 && toCol < toPixels[0].length;  fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }  
  }  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
    Picture gull = new Picture("seagull.jpg");
    this.copy2(gull,162,203,235,325,239,400);
  }

  public void myCollage(){
    Picture w = new Picture("Whitehouse.png");
    w.mirrorVerticalRightToLeft();
    this.copy(w,0,0);
    Picture w1 = new Picture("Whitehouse.png");
    Picture w2 = w1.scale(.5,.5);
    this.copy2(w1,305,195,55,116,67,121);  
    w1.keepOnlyBlue();
    Picture w5= new Picture("Whitehouse.png");    
    w5.keepOnlyRed();
    Picture w6 = new Picture("Whitehouse.png");
    this.copy2(w5,205,195,55,116,67,121);
    w6.keepOnlyGreen();
    this.copy2(w6,105,195,55,116,67,121);  
    Picture w7 = new Picture("Whitehouse.png");
    w7.negate();
    this.copy2(w7,405,195,55,116,67,121);
    Picture w8 = new Picture("Whitehouse.png");
    w8.keepOnlyBlue();
    this.copy2(w8,405,195,55,116,67,121);
    Picture w9 = new Picture("Whitehouse.png");
    w9.keepOnlyBlue();
    w9.negate();
    this.copy2(w9,108,30,55,116,67,121);
    w2.mirrorHorizontal();
    this.copy(w2,128,237);
    Picture w3 = w2.scale(2,2);
    w3.grayscaleLuminosity();
    w3.mirrorDiagonal();
    this.copy(w3,128,329);
    Picture m = new Picture("blue-mark.jpg");
    Picture smallM = m.scale(0.25,0.25);
    smallM.mirrorHorizontalBotToTop();
    this.copy(smallM,31,463);


  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length - 1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        if (leftPixel.colorDistance(rightPixel.getColor()) > edgeDist || topPixel.colorDistance(bottomPixel.getColor()) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

public void edgeDetection2(int edgeDist){
    Pixel leftPixel = null;
    Pixel nextPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color nextColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        if (col < pixels[0].length - 1) {
          leftPixel = pixels[row][col];
          nextPixel = pixels[row][col + 1];
          nextColor = nextPixel.getColor();
          if (leftPixel.colorDistance(nextColor) > edgeDist) {
            leftPixel.setColor(Color.BLACK);
            continue;
          }
        }
        if (row < pixels.length - 1) {
          nextPixel = pixels[row+1][col];
          nextColor = nextPixel.getColor();
          if (leftPixel.colorDistance(nextColor) > edgeDist) {
            leftPixel.setColor(Color.BLACK);
            continue;
          }
        }
        leftPixel.setColor(Color.WHITE);
      }
    }
  }

  public void blur(int x, int y, int w, int h){
    Pixel[][] pixels = this.getPixels2D();
    int avg = 0;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    
    for (int row = x; row < x+h; row++)
    {
      for (int col = y; col < y+w; col++)
      {
        if (x >= 0 && y >= 0 && x-1 >= 0 && y-1 >= 0 && x+1<=x+h && y+1<=y+h){
        leftPixel = pixels[row][col-1];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row-1][col];
        bottomPixel = pixels[row + 1][col];
        pixels[row][col].setGreen((int)((leftPixel.getGreen() + rightPixel.getGreen() + topPixel.getGreen() + bottomPixel.getGreen())/4));
        pixels[row][col].setBlue((int)(leftPixel.getBlue() + rightPixel.getBlue() + topPixel.getBlue() + bottomPixel.getBlue())/4);
        pixels[row][col].setRed((int)((leftPixel.getRed() + rightPixel.getRed() + topPixel.getRed() + bottomPixel.getRed())/4));
      }
      }
    }    
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
