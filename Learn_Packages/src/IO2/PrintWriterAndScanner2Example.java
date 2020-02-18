package IO2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PrintWriterAndScanner2Example {

	public static void main (String [] args) {
		
	Scanner sc = null; // ������ ��� �������� �� �� ����� ��� ��� �� try-cacth.
		
	System.out.println("���� �� ����� ��� �������");	
	Scanner scan = new Scanner (System.in);
	String filename = scan.nextLine();
	
	try {
	sc = new Scanner (new File(filename));	
	}
	catch (FileNotFoundException e) {
		System.out.println(e.getMessage());		
}
	while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
		
	}
}
	}


// �������� ��� �� �������:

//hasNextDouble()
//hasNextLine()...
