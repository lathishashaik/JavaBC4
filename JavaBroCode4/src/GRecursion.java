import java.util.Scanner;

public class GRecursion {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a distance you want to walk?");
		int distance=scan.nextInt();
		takeAStep(0, distance);
		 
	}
	static void takeAStep(int i,int j) {
		if(i<j) {
			i++;
			System.out.println("You take a step: "+i+" meter/s");
			takeAStep(i, j);
		}
		else {
			System.out.println("You are done walking :)");
		}
		
	}

}
