package Exceptionn;
import java.util.Scanner;
import java.util.*;

public class MismatchException {
public static void main (String[] args) {
int flag = 0;	
int a;
	do {	
    System.out.println("Give an Integer");
    Scanner scan = new Scanner (System.in); // �� ������ ���������� �� ��������� ���� ���� do ��� �� ��������� ����� � ������ ����� ���� ������, ��� �� ��� ��������� �������� �� loop.
	try {
	a = scan.nextInt();
	System.out.println("Your Integer: "+ a);
	flag = 1;
	}
	catch (InputMismatchException e) {
		System.out.println("Proglem");
	//scan.nextInt();
	}
}
	while (flag == 0); }

}

// ��� �� ������ �� ������� �� try Exception ���� ��� � ������� ���� �� ����� ���� ������.