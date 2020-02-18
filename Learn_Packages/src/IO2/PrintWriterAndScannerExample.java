package IO2;

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;

public class PrintWriterAndScannerExample {

	
	public static void main (String[] args) {
		
		PrintWriter pw = null; // �� ������ �� �� �������� ���, ��� �� �������� �� �� ����� ��� ���� �� cache.
		
		System.out.println("���� ������");
		Scanner scan = new Scanner (System.in);
		String name = scan.nextLine();
		
		
		try { // Try- cacth ��� �� Exception
			pw = new PrintWriter (new FileOutputStream(name, true)); // �� �������� ���� ��� �� �������� �� ��� ��� ������� ������, �� ��� ������� �� ������� ���� �� ����� �������.
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getStackTrace());
		}
		
		// ���� ��� ����, �������� ��� ������.
		
		Scanner sc = new Scanner (System.in);
		pw.println (sc.nextLine());
		pw.close();
			
	}
	
	//********
	// ��� ������, ��� ������ ��������, �������������� ��� PrintWriter ��� �� ������ ���� (������)
	// ��� ��� Scanner ��� �� �������� ���� (�������). ���� ����� ������� ��� System ���� ���� ��� ������.
	
}
