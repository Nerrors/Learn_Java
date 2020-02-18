package Interfacess;

/*
 *  � ������� Cloneable ����� ��� ������ ��������� ������ ����� ����. ������ ����� ������� �����������.
 * 
 * ��������������� ��� �� ������� ��� ��� ��� ����� �������� ������������� ���������� ���������.
 * 
 * ��� �������� ����������, ������ ������������ �� ����������� obj1 ��� ����������� obj2.
 * 
 * � ����� ��� Clonablee ����� overrides ��� ������ clone() ��� ������ Object.	
 * 
 * �� ��������� �� ������� exception ��� ��� ������� Implements �� interface Clonable.
 * 
 * � ������� �� ������ �� ������� ����: obj1.equals(obj2) ��� ��� obj1 == obj2.
 * 
 */


public class Clonablee implements Cloneable {

	   private String dname;

	   public Clonablee (String dname) {
		this.dname = dname;
	   }

	   public String getName() {
		return dname;
	   }
	   
	   public void setName(String dname) {
		   this.dname = dname;
	   }
	   public String toString () {
		   return dname;
	   }
	   
	   public Object clone() throws CloneNotSupportedException { 
		   return (Clonablee)super.clone();
	   }
	   
	 ///--------------------------------------------------\\\  
	   
 public static void main (String[] args) {
		   
  Clonablee cl1 = new Clonablee ("Tommy");
		   
   try {
			   
		Clonablee cl2 = (Clonablee) cl1.clone();
		System.out.println(cl1);
		System.out.println(cl2);
		
		if (cl1.equals(cl2) == true)
			System.out.println("True");
		else
			System.out.println("False");
			   
		  } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
		  }	   
	 }
}

// ��� ������ �� �� ������� ���� Clonablee cl1 = cl2; ����� ���� ������� 2 ������� ��� ���� �� �����������.

