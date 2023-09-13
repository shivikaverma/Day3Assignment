package assignmentthree;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Map<Integer,String> car= new HashMap<Integer,String>();  
		  car.put(1, "");
		  car.put(2, "Suzuki");
		  car.put(3, "Mercedes");
		  car.put(4, "Audi");
		  car.put(5, "BMW");
		  for(Map.Entry <Integer,String> mapEntry : car.entrySet()){  
		   System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());  

	}
  }
}
