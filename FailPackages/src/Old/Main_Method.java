
public class Main_Method {
public static void main (String[] args) {
	Interfaces p = new Interfaces (40,10.6);
	System.out.println (p.getperimeter(10));
	Measurable name = new Interfaces (10,20);
	System.out.println (name.getperimeter(10));
	
	/*
	Measurable n;
	Interfaces p2 = new Interfaces (100.5,200.6);
	n = p2;
	System.out.println (n.getperimeter(100));
	*/ 
	
	Measurable name2=p;
	System.out.println (name2.getperimeter(10));
	System.out.println (name2.PI);
	System.out.println (name.toString());
	
	display(name);
/* // Αφού πάμε να κάνουμε κλήση την μέθοδο display, αφού μέσα στις παρενθέσεις
 *  στις παραμέτρους, θα πρέπει να έχει να έχει και ένα όνομα τύπου διασύνδεσης,
 *  αφού στην μέθοδο έχουμε Measurable n.
 */
}
public static void display (Measurable n) { // Μια διασύνδεση ως τύπος.
	System.out.println(n.getperimeter(30));
}
/* Για να μην μας μπερδεύει, μπορούμε να σκεφτούμαι το εξής παράδειγμα:
 * String greeting = "Test";
 * namemethod (greeting);
 * public void namemethod (String a) {
 * }
 * 
 */
}
