package Java_Advance_Assignment;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Assignment_4 {
//Sort elements by frequency. Sort elements of an array by frequency of the elements of the array. Sort the elements by increasing order of their frequency. If two elements have same frequency then retain their order in input array. *
	public static void main(String[] args) {
		
		int[]a = new int[]{2,5,3,8,7,2,5,2,3};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int count:a){
			list.add(count);
		}
	System.out.println("INPUT is: "+ list);
	
	
	Collections.sort(list);
	System.out.println("OUTPUT is: " + list);
	
	}
}