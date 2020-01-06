package Java_Advance_Assignment;


import java.util.Iterator;
import java.util.Vector;

public class Assignment_6 {
//Write a program to insert "tekarch" into vector then insert user input number(N) of Z's from 3rd position. Delete N characters from 6th position from vector *
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<String>();
		
		list.add("t");
		list.add("e");
		list.add("k");
		list.add("a");
		list.add("r");
		list.add("c");
		list.add("h");
		
		list.add(3, "z");
		list.add(3, "z");
		list.add(3, "z");
		list.add(3, "z");
		list.add(3, "z");
		
		list.remove(6);
		list.remove(6);
		list.remove(6);
		list.remove(6);
		list.remove(6);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
	}
	

