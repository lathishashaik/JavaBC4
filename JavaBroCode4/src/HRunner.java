import java.util.Scanner;

public class HRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
	
		try {
			checkAge(age);
		}
		catch(Exception e) {
			System.out.println("Something went wrong "+e);
		}

	}
	static void checkAge(int age) throws AgeException {
		if(age<18) {
			throw new AgeException("\n"+"You must be 18 or greater to sign up");
		}
		else {
			System.out.println("You are now signed up");
		}
	}

}
