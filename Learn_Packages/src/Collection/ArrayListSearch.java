package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
	
static ArrayList<String> ar;	
	
public static void main (String[] args) {
		
		ar  = new ArrayList<>();
		ar.add("Kwstas");
		ar.add("Angelikh");
		ar.add("Bibh");
		ar.add("Aleksandros");
		
		
		System.out.println("���� ��� string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(search(str));
	}

	private static String search(String str) {
		String st = "��� �������";
		
		for (int i = 0; i<ar.size(); i++) {
			if ( ar.get(i).equals(str))
				return "�������" ;
		}
		return st;
	}
}


/*
 * 	private static String search(String str) {
		String st = "��� �������";
		
		for (int i = 0; i<ar.size(); i++) {
			if ( ar.get(i).equals(str))
				st = "�������";
				return st ;
		}
		return st;
	}
 */
