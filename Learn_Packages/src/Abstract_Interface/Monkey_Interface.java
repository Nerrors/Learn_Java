package Abstract_Interface;

public class Monkey_Interface implements Animals_Interface {
	private double myWidth;
	private double myHeight;
	
	public Monkey_Interface (int myWidth, int myHeight) {
		this.myWidth = myWidth;
		this.myHeight = myHeight;
	}
	
	@Override
	public double getPerimeter() {
		int k = a;
		return 4 * (myWidth + myHeight);
	}

	@Override
	public double getArea() {
		return myWidth * 2 * myHeight ;
	}
	
	public String display (Animals_Interface b) {
		return "�� width �����" + b.getPerimeter() + "�� Area �����" + b.getArea();
	}
/* ���� �������� ��� ��� �������� ����������, ��� interface ����� ����� ��������.
 * 
 * ���� ��������� : ��� �� ��������� ��� ������ ��� ���� �� ���� ������� Interface, �� ������ �� ��������� ��� ����������� ������������ ������ ��� ��� ��������.
 * 
 * 
 */
}
