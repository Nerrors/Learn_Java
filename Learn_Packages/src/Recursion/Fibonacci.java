package Recursion;

import java.util.Scanner;

public class Fibonacci {

	static int old = 0; //�� ���� ������ ���� �������� ���� ���� main, �������� �� ��������������� ��� � ������ �� ��� �������� ���� ��� ������ 1.
	static int old2 = 1;
	static int result = 0;
	static int i = 1;
	    
	public static void main(String []args){
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println ("���� ��� ������");
	int number = sc.nextInt();
	fibbonaciiMethod(number); //*******��� ���������� ��� �� ������� System.out.println (fibbonaciiMethod(number)); ��� ��� ������ ��� ������ sysout ���� ���� ������.
	}
	
	
	public static int fibbonaciiMethod (int newnumber) {
	    
	    if ( newnumber == 1)
	        return result;

	    else {
	    		result = old + old2;
	    		old = old2;
	    		old2 = result;
	    		System.out.println (result);  
	    		
	    		return fibbonaciiMethod (newnumber-1); // ������ �� ����� �� newnumber == 1 ��� �� ����������.
	    
	        }
	    }
	}

/* 
[1] = 1 + 1, [1] = 2
[2] = 1 + 2, [2] = 3
[3] = 2 + 3, [3] = 5    
[4] = 3 + 5, [4] = 8
*/     
