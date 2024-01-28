package javapractise2023;

public class classmethodswithoutobject {

	public static void main(String[] args) {
		
				
				createaccessmethods c = new createaccessmethods();
				
				
				String name =  getdata();
				System.out.println(name); 
				createaccessmethods2 c2 = new createaccessmethods2();
				c2.geuserdata();
				
		
			}
			
			 
			//public String getdata()
			// is there any way i can access my own class methods without object
			// yes by giving my method as static
	// now the method  getdata() will belong to class not the object, so u can remove 'c' object in
	//  String name = c.getdata();
	
	          public static String getdata()
			{
				System.out.println("great fun");
				return "adi manav";
				
			}

		


	}

