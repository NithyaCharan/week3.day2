package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		List<Integer> intList = new ArrayList<Integer>(data.length);
		
		//adding the array elements to the list
		for (int i : data)
		{
		    intList.add(i);
		}

		//sorting the elements
		Collections.sort(intList);
		
		System.out.println(intList);
		
		//get the size of the list
		int size = intList.size();
		
		//get the second largest value and print 
		int secLarge = intList.get(size-2);
		
		System.out.println("The second largest number in list is : " +secLarge);
	}

}
