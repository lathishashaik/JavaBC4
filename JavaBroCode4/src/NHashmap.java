import java.util.HashMap;

//Hashmap is similar to array list but stores key value pairs(stores objects =>need
//													use Wrapper classes)
public class NHashmap {

	public static void main(String[] args) {
		HashMap<String,String> countries=new HashMap<>();
		countries.put("India","NewDelhi");
		countries.put("USA","Washington DC");
		countries.put("Russia","Moscow");
		countries.put("China","Beijing");
		
		countries.remove("China");
		System.out.println(countries.get("Russia"));
		countries.replace("USA", "Deteroit");
		System.out.println(countries.containsKey("England"));
		System.out.println(countries.containsValue("NewDelhi"));
		
		//display all keys & values
		for(String i: countries.keySet()) {
			System.out.print(i+" = ");
			System.out.print(countries.get(i));
			System.out.println();
		}
		
	}

}
