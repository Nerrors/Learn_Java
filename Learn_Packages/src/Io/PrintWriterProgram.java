package Io;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class PrintWriterProgram {
	
	public static void main (String [] args) {
	String g;
		try {
		PrintWriter printwriter = new PrintWriter 
				(new FileOutputStream 
					(new File ("C:\\Users\\Aleksandros\\Documents\\maya\\projects\\default\\images\\tet.txt"),true));
		// ��������������� ��� ����� FileOutputStream ��� �� ������� ������, �� true.
	
		Scanner user = new Scanner (System.in);
		System.out.println("Give a String ");
		String l = user.nextLine();
		
		printwriter.println(l); // �� ���� ��� ������ ��� ������ PrintWriter, ��������� �� String ��� ������.
		
		Scanner scan = new Scanner (new FileInputStream (new File ("C:\\\\Users\\\\Aleksandros\\\\Documents\\\\maya\\\\projects\\\\default\\\\images\\\\test.txt")));
	    //������� ��� ��� �� ������������, ���� ��� ��� ������.
		while (scan.hasNextLine()) {
			 g = scan.nextLine();
			System.out.println(g);
		}
		scan.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Error");
			System.exit(0);
		}
		
	}
}

/* ��� PrintWriter ��� ��������������� ��� ������ ��������.
 * 
 * �������: ��������� �������������� ����������� ������������ �� ��� ���, ������ ��������.
 * 
 * ���� ��� ���� �������� ��������.
 * 
 * 
 */


/*            ***File-Methods***
 *  canRead();
 *  canWrite();
 *  delete();
 *  exists();
 *  getName();
 *  getPath();
 *  length();
 */
