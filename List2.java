package assignmentthree;

import java.util.ArrayList;
import java.util.List;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		if(number.contains(3))
			System.out.println("Element found");
			else
				System.out.println("Element not found");
			
		}
		

	}
