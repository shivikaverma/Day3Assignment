package assignmentthree;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.print("ArrayList: " +list);
		
		int first = list.get(0);
		int last =  list.get(list.size() - 1);
		
		System.out.println("\nFirst : " + first
                + ", Last : " + last);
		

	}

}
