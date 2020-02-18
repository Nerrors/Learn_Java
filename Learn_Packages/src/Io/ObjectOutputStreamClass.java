package Io;

import java.io.EOFException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ObjectOutputStreamClass {

	private ObjectInputStream ois = null; //***** ���� �� ��� public ������, ��� �������� �� ������ private ����������.
	private ObjectOutputStream oos = null; 
	
// ������ ��� �������������� ������� ������������, ��������������� � ��������������.
	
	public void connectToOutputFile() {
		try {
			Scanner s = new Scanner (System.in);
			String ss = s.nextLine();
			oos = new ObjectOutputStream (new FileOutputStream (new File (ss)));
			
		}
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
	}
	
	public void connectToInputFile() {
		try {
			Scanner s = new Scanner (System.in);
			String ss = s.nextLine();
			ois = new ObjectInputStream (new FileInputStream (new File (ss)));
			
		}
		catch (FileNotFoundException e) { // ***���� �� ������ ����������� �� ���� ���� ��� �� IOException.
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
			
		}
	}
	
	public void closestreams () {
		
		try {
		ois.close();
		oos.close();
		}
		
		catch (IOException e) {
			System.out.println("Problem");
			System.out.println(e.getMessage());
	}
	}
	
	
	public void output () { // ����� void ��� ��� ���������� ������, ����� �� ��� System.out.println(); �� ����������� ��������� ���� �������.
		
	try {
		while (true) {
			String t = ois.readUTF();
			System.out.println(t);
		}	
	}
	catch (IOException e) {
		System.out.println("Problem");
		System.out.println(e.getMessage());
		
	}
	}
	
	
	
	public static void main (String[] args) {
		ObjectOutputStreamClass objectclass = new ObjectOutputStreamClass ();
	
		objectclass.connectToOutputFile();
		objectclass.connectToInputFile();
		objectclass.output();
		objectclass.closestreams();
	}

	
	
}

/* �� ������� ObjectInputStream ��� ObjectOutputStream ���������� ��� ��������� �/� ��� �����������.
 * 
 * �� ObjectInputStream ��� ObjectOutputStream �������� ���� ��� ����������� ��� �������
 * DataInputStream ��� DataOutputStream, �������� ������� �� ��� ��������������� ������.
 * 
 * ��������, �������� �� interfaces ObjectInput ��� ObjectStreamConstants
 * � ObjectInput ����� ��� ���-������� ��� DataInput.
 */