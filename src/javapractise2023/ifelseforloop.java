package javapractise2023;

public class ifelseforloop {

	public static void main(String[] args) {

				
				  int[] arr3 = {1,2,3,4,5,6,7,8,9};
				  
				  for(int i =0 ; i<arr3.length ; i++)
					   
				  {
					  if (arr3[i] % 2 ==0)
					  {  
						  System.out.println(arr3[i]);
						  
						//   break;   we can also use break, then as soon as arr3[i] % 2 ==0 condition is met
						// it will break.
				 
				  }
				  else
				  {  
					System.out.println(arr3[i] +"is not a multiple of 2");
				  }
				
			}

	

	}
}


