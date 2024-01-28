package javapractise2023;

public class stringsandimpstringmethods {

	public static void main(String[] args) {
		
		
		//generally used in automation this way---- string is an object // string literal
		
		String s1 = "earth is beautiful";
		 String s5 = "poppy oyye";
		 
		 // new
		 String s2 = new String("welcome");
		 String s3 = new String("welcome");
		 
		 // so here basically string will go and slit it into three pieces
		 //that means 3 strings will be created so when multiple string are 
		 // created,then that becomes an array right
		 // so we can capture all 3 strings into one array( see below code)
		 
		 String s = "earth is beautiful";
		// String[] splittedstring = s.split(" "); // split on basis of white spaces
		 
		 String[] splittedstring = s.split("is");
		 // or split on basis of "is"
		 // now we want to know what value got into the above array and print value of it
		 
		 System.out.println(splittedstring[0]);
		 System.out.println(splittedstring[1]);
		// System.out.println(splittedstring[2]);
		 
		 System.out.println(splittedstring[1].trim());
		 //now if u want to remove the white space, u can use .trim
		 
		 // now use for loop here to print character by character
		 
		 for(int i=0; i<s.length(); i++)
		 {
			 System.out.println(s.charAt(i));
		 }
		 System.out.println("**************************");
	
		 
		 
     // for loop to iterate in reverse order
	for(int i=s.length()-1; i>=0; i--) 
	{
		System.out.println(s.charAt(i));
	}

		 
		 
			 
	}

}		 
		 
		
		 


