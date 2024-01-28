package javapractise2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		// dynamically increase the size of array, example a shopping site has increased number of products
		//from 6 to let say 10 now
		
	ArrayList<String> a = new ArrayList<String>();
	//explicitly telling that this array is going to store string value
	
	// also arraylist is a class and a is an object and new is memory allocation of classname (ArrayList)
	
	a.add("abhishek");
	a.add("rahul");
	a.add("salil");
	System.out.println(a.indexOf("rahul"));
	System.out.println(a.get(2) +"is so cute na");
	
	
	// create method of the class - object.method
	
	//now user for loop here for array list
	for(int i=0; i<a.size(); i++)
	{
		System.out.println(a.get(i));
	}
	
	System.out.println("************************************");
	
	
	//enhanced for loop for arraylist
	for( String val :a)
	{
		System.out.println(val);
	}
	
	
	// now if you want to know that weather item is present in array list or not
	System.out.println(a.contains("rahul"));
	
	}
	
	}

