package basic.test.exam;

import java.util.*;
import java.lang.*;
import java.io.*;

//public class CraftsmanInformation {

//}

class CraftsmanInformation{
	private static Integer[] add(Integer[] originalArr, Integer val) {
		Integer[] newArray = Arrays.copyOf(originalArr, originalArr.length + 1);
		newArray[newArray.length - 1] = val;
		return newArray;
	}
	
	public static void main(String[] args) {
		String test1 = "15, -41, 12, 42, -12, 2, 4";
		String test2 = test1.replaceAll("[^0-9,-]", ",");
		StringTokenizer strtok = new StringTokenizer(test2, ",");
		Integer[] originalArr = new Integer[strtok.countTokens()];
		int index = 0;
		
		while(strtok.hasMoreTokens()) {
			originalArr[index] = Integer.parseInt(strtok.nextToken().trim());
			index++;
		}
		
		Integer val = 99;
		Integer[] newArr = add(originalArr, val);
		Integer maxNumber = Integer.MIN_VALUE;
		
		for(Integer num : newArr) {
			if(num > maxNumber) {
				maxNumber = num;
			}
		}
		System.out.println(maxNumber);
	}
}
