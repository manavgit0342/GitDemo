package javapractise2023;

public class createaccessmethods {

	public static void main(String[] args) {
		
		createaccessmethods c = new createaccessmethods();
		//6. so capture string in one variable named as 'name' and print it
		
		String name = c.getdata();
		System.out.println(name); 
		createaccessmethods2 c2 = new createaccessmethods2();
		c2.geuserdata();
		
		// 4.now when u execute it, this method will get print --"great fun"
		
		
		
		

	}
	// why method 
	
	//1. so basically if u have some line of code which you reuse everytime,
	//   what u can do is, u can wrap all that lines in one block and for that block u can give one name
	//   so whenever u want to use that set of code, if u can simply call that block name, automatically all
	//   that lines of code will be executed,so instead of repeating those lines again and again, whenever u think 
	//   that some line of code can be reused in many places, then u can create a method for it and wrap all that line of
	//   of code into that method.
	
	//2.example do remember that if u want to create any method in class, u should not create inside main block
	//  as its reserved for execution
	 
	public String getdata()
	//above method does not return anything, also it means as its public, so it can be used by another class also
	
	{
		System.out.println("great fun");
		// 3.now if u want to  call that method inside that execution block, how will u do that
		//   by creating object of that class , check in main block now
		// 5.and if this method(getdata()) returns below code, error will come as we are returning string
		//  but saying void at ---- public void getdata() , so instead use public String getdata()
		
		return "adi manav";
		
	}

}
