//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static String printArray(int[] array){
		String toPrint = "";
		for (int i = 0; i < array.length; i ++){
			toPrint += array[i] + " ";
		}
		return toPrint;
	}

	public static int[] shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++){
			if (array[i] == 7){
				for (int e = 0; e<array.length; e++){
					if (array[e]!=7){
						int temp = array[i];
						array[i] = array[e];
						array[e] = temp;
					}
				}
			}
		}

		return array;

	}
}