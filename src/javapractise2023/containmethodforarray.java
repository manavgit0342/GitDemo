package javapractise2023;

import java.util.Arrays;
import java.util.List;

public class containmethodforarray {

	public static void main(String[] args) {
		
		// now if u want to utilize the contains method for an array below
		String[] name = {"hello", "you", "dumb", "idiot"};
	    // now we can convert the above array to arraylist
		
		Arrays.asList(name);
		//no capture the above in one variable
		
		List<String> broArrayList = Arrays.asList(name); 
		System.out.println(broArrayList.contains("dumb"));

	}

}
