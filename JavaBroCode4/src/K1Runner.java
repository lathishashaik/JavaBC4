//Anonymous Inner Class
public class K1Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K1Greeting g1=new K1Greeting();
	
		K1Greeting g2=new K1Greeting() {
			@Override
			void welcome() {
				System.out.println("Yo Bro");
			}
		};
	g1.welcome();
	g2.welcome();
}
}
