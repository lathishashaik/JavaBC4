
public class M2Runner {

	public static void main(String[] args) {
		//4 classes
		/*M2IntegerClass i=new M2IntegerClass(7);
		M2DoubleClass d=new M2DoubleClass(3.14);
		M2CharacterClass c=new M2CharacterClass('#');
		M2StringClass s=new M2StringClass("Bro");*/
		
		//One thing
		/*M2Generics<Integer> i=new M2Generics<>(7);
		M2Generics<Double> d=new M2Generics<>(3.14);
		M2Generics<Character> c=new M2Generics<>('#');
		M2Generics<String> s=new M2Generics<>("Bro");
		System.out.println(i.getValue());
		System.out.println(d.getValue());
		System.out.println(c.getValue());
		System.out.println(s.getValue());*/
		
//2 things & Thing1 constraint is it's type should only be any subclasses of Number
		M2Generics<Integer,Character> i=new M2Generics<>(7,'r');
		M2Generics<Double,String> d=new M2Generics<>(3.14,"Bro");
		System.out.println(i.getValue1());
		System.out.println(i.getValue2());
		System.out.println(d.getValue1());
		System.out.println(d.getValue2());
		
	}

}
