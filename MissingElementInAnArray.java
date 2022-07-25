package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		
		//sorting the array
		Arrays.sort(arr);
		
		int max = 0;
		
		Set<Integer> missing = new LinkedHashSet<Integer>();

		//after sorting the elements in the array, add it to the set(so duplicates will be removed)
		//and assign it to the max variable to find the highest number in the set(since it is sorted, lST NUMBER Will be the highest
		
		for (int i = 0; i < arr.length; i++) {
			missing.add(arr[i]);
			max = arr[i];
		}

		//loop through till the highest number, if any number is missing in the set, print the number
		
        for(int j = 1; j < max; j++) {
            if(!missing.contains(j))
            	System.out.println(j);
       }
	}

}
