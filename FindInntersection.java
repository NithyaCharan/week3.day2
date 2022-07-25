package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindInntersection {

	public static void main(String[] args) {

		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();

		//assigning both the arrays to a map,as key and value
		
		for (int i = 0; i < arr2.length; i++) {
			numMap.put(arr1[i], arr2[i]);
		}
		
		//iterating through the map, and compare the valuse of both arrays,(key and value elements)
		//if they are same, then print the key(value from first array
		
		 for (Entry<Integer, Integer> entry : numMap.entrySet()) {
				if(entry.getValue() == entry.getKey()) {
					System.out.println(entry.getKey());
				}
	}

}
}
