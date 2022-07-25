package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {

		int[] input = {2,3,5,6,3,2,1,4,2,1,6,-1};
		
		Arrays.sort(input);
		
		Map<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < input.length; i++) {
			int key = input[i];
			
			//if the map already contains the input,
			//increment the count value by 1
			//else assign the value as 1
			
			if(numMap.containsKey(key)) {
				int value = numMap.get(key);
				numMap.put(input[i], value+1);
			}else
			{
				numMap.put(input[i], 1);

			}
				
		}
		System.out.println(numMap);

	}

}
