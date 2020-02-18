package Abstract_Interface;

public class Cat_Interface implements Animals_Interface {
private double myWidth;
private double myHeight;

public Cat_Interface (double myWidth, double myHeight) {
	this.myWidth = myWidth;
	this.myHeight = myHeight;
}
public double getPerimeter () {
	int k = a; // ���� ��� ���� abstract ������� ����� �� �� �������������. ��� ������� ���� Main,  �������� �� �������� int k = Animals_Interface.a;
	return 2 * (myWidth + myHeight);
	
}

public double getArea( ) {
	return myWidth * myHeight ;
} 
public String display (Animals_Interface c) {
	
	return "�� width �����" + c.getPerimeter() + "�� Area �����" + c.getArea();
	}
}

/* Interfaces
 * 
 * ���� ��� ���� abstract �������, ���� ��� ������ ����� implements ��� interface, �� ������ �� �������� ���� ��� �������� ��� ����� ������� ���� ��� interface.
 * 
 * ��� ��� ��� ������� �������� ��� ����� �������� ������ ��� anstract ��� ��� interface ����� ���:
 *
 * ��� interfaces, �������� �� ��������� ���� �������� ���������� ��� �������� (����� ������).
 * ���� abstract �������, ��� ������ ������ ���� ������������, ��� �������� �� ��������� ��� �������������, ��� ����������(public, private...), ���� ��� ����� ��� ��������, ����� �� ���������� � ����� ��� ��� ����� extends, �� ��� ����������.
 * 
 * ��� ���� ������� ����� ��� ��� ����� ������ �� ����� extends ���� ��� ���� �����, ��� ������ �� ����� implements ��� interface �����.
 * 
 * ��� ���� ������� ����� ��� � abstract ����� ����� �� �������� �� �� Interface. ������ ��� �������� ��� ����� ��� ���� �������� ���� �����, ������ ������ �� ������� ��� ��������� ��� ������������� ��� �����.
 * 
 * ��� ����� ��� abstract ��� ��� interfaces, ����� ��� � ����� main ��� ������ �� ������������ ����������� (������ ��� �����: Animals_Interface v = new Animals_Interface(), ���� ������ ���� Animals_Interface v = new Cat_Interface(..., ...); ).
 */
