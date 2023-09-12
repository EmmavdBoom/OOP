
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow world!");
		
		Product p1;				// Declaration
		p1 = new Product();		//Assignment
		p1.Name = "TV";			// Object
		p1.setPrice(123);
		p1.totalPrice = 20;
		
		String antwoord = p1.description();
		System.out.println("Antwoord = " + antwoord);
		
		Product p2 = new Product(); // Initialization
		
		// 2 objects and fill in the properties
		Persoon pr1 = new Persoon();
		pr1.name = "Henk";
		pr1.printName();
		pr1.leeftijd = 30;
		pr1.printLeeftijd();
		
		Persoon pr2 = new Persoon();
		pr2.name = "Ana";
		pr2.printName();
		pr2.leeftijd = 25;
		pr2.printLeeftijd();
		
		String persoonOmschrijving = pr1.description();
		System.out.println("Antwoord = "+ persoonOmschrijving);
		
		Product p3 = new Product("Fiets");
		
		Persoon pr3 = new Persoon("Chantal ", 30, " mail@gmail.com ", "+31673827 ", "Hagel 12");
		
	}

}
