package Data_Structures;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicatesNumbers {
	
	static ArrayList<Integer> findDuplicate(int[] arr){
		HashSet<Integer> check = new HashSet<Integer>();
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		for(int num : arr) {
			if(check.contains(num)) {
				if(!duplicates.contains(num)) {
					duplicates.add(num);
				}
			}else {
				check.add(num);
			}
		}
		return duplicates;
	}

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3, 1, 4, 2};
		ArrayList<Integer> duplicates = findDuplicate(arr);
		
		System.out.println(duplicates);

	}

}
