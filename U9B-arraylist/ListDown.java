//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListDown
{

	public static void main(String args[]){
		ArrayList<Integer> ray1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 9, 10));
		System.out.println(go(ray1));
		ArrayList<Integer> ray2 = new ArrayList<Integer>(Arrays.asList(4,3,2,1,0));
		System.out.println(go(ray2));


	}
  //go() will return true if all numbers in numArray
  //are in decreasing order [31,12,6,2,1]
  public static boolean go(List<Integer> numArray)
  {
  	for (int i = 0; i < numArray.size()-1; i++){
  		if (numArray.get(i) >= numArray.get(i+1)){
  			return false;
  		}
  	}
    return true;
  }	
}