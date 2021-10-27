package library;

public class author {
	private int age;
	private String type;
	private addressaut addressaut;

	public author() {System.out.println("def cons");}

	public author(int age, String type, addressaut addressaut) {
	super();
	this.age = age;
	this.type = type;
	this.addressaut = addressaut;
	}
	void display() {
	System.out.println("*************Author Details***************");
	}
	void show(){

	System.out.println("Author AGE : "+age+" "+"\n"+"Author type : "+type);
	System.out.println("ADDRESS :");
	System.out.println(addressaut.addressPrint());
	}


}
