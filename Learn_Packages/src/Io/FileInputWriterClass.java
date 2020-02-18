package Io;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class FileInputWriterClass {
	
public static void main (String[] args) {
	try {
	File file = new File ("C:\\Users\\Aleksandros\\Eclipse Projects\\Project_1\\src\\Basics\\text.txt");
	FileOutputStream fis = new FileOutputStream (file, true);
	fis.write(8467567);
	
	}
	catch (IOException e) {
		System.out.println("File Not Found");
	}
}
}

/* �������: �� ������� FileInputStream ��� FileOutputStream ��� �������� ���� ��������,
 * ��� �������������� �� ������� ��� ��� ������� InputStream ��� OutputStream.
 *
 * ��������, � ����� FileInputStream ���������� ��� (�������) ������ text.txt ��� ������� ���� ��� ������ 8467567.
 * 
 * �� ���� ������ ��� ���� � ����� FileOutputStream ����� �� , true
 */