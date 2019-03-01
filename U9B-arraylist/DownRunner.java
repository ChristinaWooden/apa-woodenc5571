//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Chris Wooden
//Date - February 28, 2019

import java.util.ArrayList;
import java.lang.System.*;


public class DownRunner
{
  public static void main( String args[] )
  {				
  	ArrayList<Integer> numberz = new ArrayList<Integer>();
  	numberz.add(-99);
  	numberz.add(1);
  	numberz.add(2);
  	numberz.add(3);
  	numberz.add(4);
  	numberz.add(5);
  	numberz.add(6);
  	numberz.add(7);
  	numberz.add(8);
  	numberz.add(9);
  	numberz.add(10);
  	numberz.add(5);

  	int sum = 0;

  	for (int i = 0; i < numberz.size(); i++){
  		if (numberz.get(i) > numberz.get(0)){
  			sum += numberz.get(i);
  		}
  	}	
  System.out.println("Sum :: " + sum);
  }

}