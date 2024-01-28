package javapractise2023;

public class arrayandloops {

	public static void main(String[] args) {
		
		 //Arrays
	       // int[] arr1 = new int[5];
	         
	      ///  arr1[0]= 1;
	       //  arr1[1]= 0;
	       //  arr1[2]= 0;
	      //  arr1[3]= 0;
	      //  arr1[4]= 4;
	         
//	        //or, we can also do like this
//	         
	         int[] arr2 = {1,0,0,0,7};
	         
	          System.out.println(arr2[4]);
	          
	       
	          //For Loops for int array
	          
	          for(int i= 0; i< arr2.length; i++)
	          {
	        	  
	        	  System.out.println(arr2[i]);
	          }
	          
	          
	          //for loop for string array
	          
	          String[] name = {"hello", "you", "dumb", "idiot"};
	          
//	        	for(int i= 0; i<name.length; i++)
//	        	{
//				System.out.println(name[i]);
//					
//	        	}
	        	
	       //   or we can also use enhanced for loop
	          
	        	for(String s: name)
	        	{
	        		System.out.println(s);
	        	}
	        		
	          
	}

}
