// Class
public class Product {
	
	// Property
	private String name;
	
	private int price;
	
	public int totalPrice;

	public String Name;
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void defineName(String name) {
		this.name = name;
	}
	
	public String description() {
		//String a = "Naam is " + name + " en prijs is " + price;
		//return a;
		return "Naam is " + name + " en prijs is " + price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price<= 100000)
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Product() {
		System.out.println("In constructor");
	}
	
	public Product(String name) {
		System.out.println("In constructor met naam " + name);
		
		this.name = name;
	}
	
	
	
}