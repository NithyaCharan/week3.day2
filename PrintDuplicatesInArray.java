package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length = arr.length;
		
		int count;
		
		//declare two lists, one for storing the elements of the array
		//and the other for finding duplicates
		List<Integer> intList = new ArrayList<Integer>(arr.length);
		
		List<Integer> finList = new ArrayList<Integer>(arr.length);

		//add every element in the array to the list
		for (int i : arr)
		{
		    intList.add(i);
		}

		//sort the elements
		Collections.sort(intList);
		
		//for each elements in the list, check if the element is in the final list,
		//if not add the element to the final list
		//if already present , print the element value
		
		for (Integer integer : intList) {
			
			if(!finList.contains(integer)) {
				
				finList.add(integer);
				
			}
			else {
				
				System.out.println(integer);
			}
		}
	}

}
