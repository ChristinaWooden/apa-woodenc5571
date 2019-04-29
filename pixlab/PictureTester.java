/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft(){
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore(); 	
  }

  public static void testMirrorHorizontal(){
  	Picture m = new Picture("redMotorcycle.jpg");
  	m.mirrorHorizontal();
  	m.explore();
  }

  public static void testMirrorHorizontalBotToTop(){
  	Picture w = new Picture("Whitehouse.png");
  	w.mirrorHorizontalBotToTop();
  	w.explore();
  }

  public static void testMirrorDiagonal(){
  	Picture b = new Picture("beach.jpg");
  	b.mirrorDiagonal();
  	b.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms(){
  	Picture s = new Picture("snowman.jpg");
  	s.explore();
  	s.mirrorArms();
  	s.explore();
  }

  public static void testMirrorGull(){
  	Picture g = new Picture("seagull.jpg");
  	g.explore();
  	g.mirrorGull();
  	g.explore();
  }

  public static void testCopy(){
  	Picture canvas = new Picture("640x480.jpg");
  	Picture gull = new Picture("seagull.jpg");
  	canvas.copy2(gull,162,203,235,325,239,400);
  	canvas.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testMyCollage(){
  	Picture canvas = new Picture("640x480.jpg");
  	canvas.myCollage();
  	canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2(){
  	Picture s = new Picture("swan.jpg");
  	s.edgeDetection2(10);
  	s.explore();
  }

  public static void testKeepOnlyBlue(){
  	Picture mark = new Picture("blue-mark.jpg");
  	mark.keepOnlyBlue();
  	mark.explore();
  }

  public static void testKeepOnlyRed(){
   	Picture mark = new Picture("blue-mark.jpg");
  	mark.keepOnlyRed();
  	mark.explore(); 	
  }

  public static void testKeepOnlyGreen(){
  	Picture mark = new Picture("blue-mark.jpg");
  	mark.keepOnlyGreen();
  	mark.explore(); 
  }

  public static void testNegate(){
  	Picture w = new Picture("Whitehouse.png");
  	w.negate();
  	w.explore();
  }

  public static void testGrayscale(){
  	Picture b = new Picture("Whitehouse.png");
  	b.grayscaleAverage();
  	b.explore();
  	b.grayscaleLightness();
  	b.explore();
  	b.grayscaleLuminosity();
  	b.explore();
  }

  public static void testFixUnderwater(){
  	Picture w = new Picture("water.jpg");
  	w.fixUnderwater();
  	w.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testKeepOnlyRed();
    testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testMyCollage();
    testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}