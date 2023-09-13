package assignmentthree;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> car= new HashMap<Integer,String>();  
		  car.put(1, "Ford");
		  car.put(2, "Suzuki");
		  car.put(3, "Mercedes");
		  car.put(4, "Audi");
		  car.put(5, "BMW");
		  
		  System.out.println(car);
		
		  String oldValue = car.replace(2, "Jagaur");
		  
		 System.out.println(car) ;

	}

}
