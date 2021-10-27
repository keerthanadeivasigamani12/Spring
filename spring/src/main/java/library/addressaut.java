package library;

public class addressaut {
	
	private String city;
	private String state;
	private String country;
	private int pin;
	public addressaut(String city, String state, String country,int pin) {
	super();
	
	this.city = city;
	this.state = state;
	this.country = country;
	this.pin=pin;
	}
	public String addressPrint(){
	return "\n"+city+"\n"+state+"\n"+country+"\n"+pin;
	}


}
