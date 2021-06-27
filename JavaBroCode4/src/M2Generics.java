//Instead of 4 M2 classes
/*public class M2Generics<Thing> {
	Thing x;
	M2Generics(Thing x){
		this.x=x;
	}
	Thing getValue() {
		return x;
	}
	

}*/

public class M2Generics<Thing1 extends Number,Thing2> {
	//Here Thing1 type should only be any subclasses of Number 
	Thing1 x;
	Thing2 y;
	M2Generics(Thing1 x,Thing2 y){
		this.x=x;
		this.y=y;
	}
	Thing1 getValue1() {
		return x;
	}
	Thing2 getValue2() {
		return y;
	}
	
}
