
public class L2Runner {

	public static void main(String[] args) {
	/*L2Interface i1=()->  {
							System.out.println("Hello ");
						   };
	i1.message();
	*/
		
		
	/*L2Interface i2=(name)->{
								System.out.println("Hello "+name);
	   						 };
	   
	  i2.message("Bro");
	*/
		L2Interface i3=(name,symbol)->{
										System.out.println("Hello "+name+symbol);
		   							  };
		   
		i3.message("Bro",'!');
		
	}

}
