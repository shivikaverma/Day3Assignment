package assignmentthree;

import java.util.ArrayList;
import java.util.Iterator;


public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> city= new ArrayList<String>();
		city.add("Bhubaneswar");
		city.add("Bangalore");
		city.add("Mumbai");
		city.add("Kolkata");
		city.add("Chennai");
		city.add("Pune");
		city.add("Lucknow");
		city.add("Ahemdabad");
		city.add("Raipur");
		city.add("Ranchi");
		
		Iterator<String> itr=city.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}   

}
