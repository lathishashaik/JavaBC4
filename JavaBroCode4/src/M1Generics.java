//Eliminates need to create multiple versions of methods or classes for diff datatypes
//Use of 1 version for different data types (reference)
//M1=>(multiple versions of methods) //M2( create multiple versions of classes)
public class M1Generics {

	public static void main(String[] args) {
		Integer intArray[]= {4,25,7,9};
		Double doubleArray[]= {1.0,9.8,5.1,6.2};
		Character charArray[]= {'a','!',',','T'};
		String strArray[]= {"Ram","Sam","Joe","Lism"};
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(strArray);
	}
	/*static void displayArray(Integer[]array) {
		for(Integer x:array) {
			System.out.print(x+" ");	
		}
		System.out.println();
	}
	static void displayArray(Double[]array) {
		for(Double x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	static void displayArray(Character[]array) {
		for(Character x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	static void displayArray(String[]array) {
		for(String x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}*/
	static <Thing>void displayArray(Thing[]array){
		for(Thing x:array) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
