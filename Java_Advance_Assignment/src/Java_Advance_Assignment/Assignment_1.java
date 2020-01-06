package Java_Advance_Assignment;


import java.util.Iterator;
import java.util.Stack;

public class Assignment_1  {

		public static void main(String[] args) {
			//Assinment: Implement Dynamic sized stack pop(),push(),peek() opeartions *
			
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			stack.push(50);
			
			stack.pop();
			
			System.out.println(stack.peek());
			
			Iterator<Integer> it = stack.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			
			
			
			
		}
		
		
	
}