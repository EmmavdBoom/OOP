import java.nio.file.spi.FileSystemProvider;

public class Persoon {
	
	public String name;
	
	public int leeftijd;
	
	public String email;
	
	public String telefoonnummer;
	
	public String adres;
	
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void defineName(String name) {
		this.name = name;
	}
	
	public void printLeeftijd() {
		System.out.println("Leeftijd is " + leeftijd);
	}
	
	public void defineLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}
	
	public void defineEmail(String email) {
		this.email = email;
	}
	
	public void defineAlles(String name, int leeftijd, String email, String telefoonnummer, String adres) {
		this.name = name;
		this.leeftijd = leeftijd;
		this.email = email;
		this.telefoonnummer = telefoonnummer;
		this.adres = adres;
	}
	
	public String description() {
		
		return "Naam is " + name + " en leeftijd is " + leeftijd;
	}
	
	public Persoon() {
		System.out.println("In constructor");
	}
	
	public Persoon(String name, int leeftijd, String email, String telefoonnummer, String adres) {
		System.out.println("In constructor met naam " + name + leeftijd + email + telefoonnummer + adres);
		
		this.name = name;
		this.leeftijd = leeftijd;
		this.email = email;
		this.telefoonnummer = telefoonnummer;
		this.adres = adres;
	}
	
	
}
