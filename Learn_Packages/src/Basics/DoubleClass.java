package Basics;

public class DoubleClass {

	static Double a = 30.6; // ��� ������� �� ��������� ��� ����������, ��� ��� ��� main, �� ������ �� ����� static.
	static Double b = 30.6;

	public static void main(String[] args) {

		System.out.println(Double.compare(a, b)); // ****** ��������������� �� Double. ������ ����� static.

		int ab = 0;
		ab = a.intValue();
		System.out.println(ab);

		System.out.println(Double.isInfinite(a));
	}
}