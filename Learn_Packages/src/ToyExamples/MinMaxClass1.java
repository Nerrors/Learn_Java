package ToyExamples;

public class MinMaxClass1 {
	static int count = 0;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	public static void main (String[] args) {
		
	int a[] = new int[4];

	a[0] = 4;
	a[1] = 8;
	a[2] = 3;
	a[3] = 9;

		System.out.println(fibbonaciiMethod(a));
		}
	
public static String fibbonaciiMethod (int []b) {
	   
for (int i=0; i<b.length; i++) {
    if (b[i] > max) {
        max = b[i];
    }
    if (b[i] < min) {
        min = b[i];  
    }   
   }
return "O max ����� � " + max + " ��� � min ����� � " + min;
}

//*** ��� ��� ������ ��� ������� ��� ������� �� ���������� ��� ����������, �������� �� ��� ������� ����� �� ��� String.
}