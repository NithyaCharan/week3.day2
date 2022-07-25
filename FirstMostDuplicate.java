package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstMostDuplicate {

	public static void main(String[] args) {

		String input = "abbaba";
		
		char[] inputArr = input.toCharArray();
		
		int max = 0;
		
		int value = 0;
		
		Map<Character, Integer> numMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < input.length(); i++) {
			char key = inputArr[i];
			
			//if the map already contains the input,
			//increment the count value by 1
			//else assign the value as 1
			if(numMap.containsKey(key)) {
				value = numMap.get(key);
				numMap.put(inputArr[i], value+1);
				max = numMap.get(key);
				if (max > value) {
					System.out.println(inputArr[i]);
					break;
				}
			}else
			{
				numMap.put(inputArr[i], 1);

			}
	
		}

	}

}
