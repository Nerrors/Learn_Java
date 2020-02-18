package Fail_Java_Programs;

import java.util.Scanner;

public class Equals {

	public static void main (String [] args) {
		System.out.println("Enter two lines");
		Scanner keyboard = new Scanner (System.in);
		String s1 = keyboard.nextLine();
		String s2 = keyboard.nextLine();
		if (s1.equals(s2))
			System.out.println("Οι 2 γραμματοσειρές είναι ίδιες");
			else
				System.out.println("Οι 2 γραμματοσειρές δεν είναι ίδιες");
		if (s1.equalsIgnoreCase(s2))
			System.out.println("Οι 2 γραμματοσειρές είναι ίδιες");
		else
			System.out.println("Οι 2 γραμματοσειρές δεν είναι ίδιες");
		
		if (s1.compareTo(s2) < 0)
			
		else if (s1.compareTo(s2) > 0)
				
				else if (s1.compareTo(s2) == 0)
						
						else {
							
							
						}
							
	}
}
