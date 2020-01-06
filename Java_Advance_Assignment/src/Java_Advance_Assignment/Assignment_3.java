package Java_Advance_Assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment_3  {
	
	//Write a java program to store 5 student information and award the students with 1st rank, 2nd rank and 3rd rank according to marks obtained where each student has student name, student marks and student reg no information. *
	public static void main(String[] args) {
		
		Student ob1= new Student("Reena" , 101 , 70);
		Student ob2= new Student("Rishi" , 201 , 90);
		Student ob3= new Student("Atharv" , 301 , 60);
		Student ob4= new Student("Anagha" , 401 , 50);
		Student ob5= new Student("Deeps" , 501 , 85);
		
		
		ArrayList<Student> list = new ArrayList<Student>();  //ArrayList with Collection
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		list.add(ob5);
		
		Collections.sort(list, new SortByMarks());  //ArrayList with Collection
		Iterator<Student> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		}
}

	