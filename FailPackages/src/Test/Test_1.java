package Test;

public class Test_1 {
	private String name;
	private int b;

	public Test_1 () {
		name = "No name yet";
		b = 0;
	}
	public Person (String newName) {
		name = newName;
		b = 30;
	}
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	public String getName() { // First Method
		return name;
		}
	public void setName(String a) { //Second Method
		name = a;
		}
	public int  writeOutput () { // Third Method
		return b;
				}
	// Η Person δεν μπορεί να χρησιμοποιήσει μια μέθοδο της Student_entend_Person ή της Undergraduate_extends_Student.
	// Το αντίστροφο γίνεται.

	//ΠΡΟΣΟΧΗ: Δημιουργούμε τους getters, και setters επειδή, δεν μπορούν οι κλάσεις που τις επεκτείνουν να πάρουν τις μεταβλητές τους κατευθείαν (παρά μόνο τις μεθόδους) σε αντίθεση με τις abstract κλάσεις και τα interfaces: (k = μεταβλητή του interface) σε άλλη μέθοδο int k = b; ή στην main int k = <Interface_Name>.b;
	}
