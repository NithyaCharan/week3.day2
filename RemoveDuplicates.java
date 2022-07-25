package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArr = text.split(" ");
		
		Set<String> remoDupStr = new LinkedHashSet<String>();
		
		//iterate through array and add the elements to the set,
		//since it is a set, duplicates will be removed here
		for (int i = 0; i < textArr.length; i++) {
			remoDupStr.add(textArr[i]);
		}

		//print each element in the set, appending spaces
		for (String string : remoDupStr) {
			System.out.print(string + " ");

		}
	}

}
