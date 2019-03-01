//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{

  public static int go( List<Integer> ray )
  {
  	for (int i = 0; i < ray.size(); i++){
  		if (ray.get(i) % 2 !=0){

  			for (int e = ray.size()-1; e>i; e--){
  				if (ray.get(e)%2==0){
  					return e-i;
  				}
  			}
  		}
  	}
    return -1;
  }
}