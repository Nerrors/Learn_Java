package Abstract_Interface;

public class Cat extends Animals {
	private int amoun;
	private int g;
	
public Cat (int fo, int th) {
	super(fo , th);
	
}
	public void food(int amount) {
		 drink+=amount; // ��� ������� ��� ��� ��������� drink ��� ������ Animals, ��� ���������� �� ��������� ���� ������. �� ������ ���� abstact. ���� ���� extend ��� �������� �� �� ������� ���� , ���� ��� interfaces.
	}
	public void drink(int amount) {
		
		food+=amount / 4;
	}
	public int cat_method(int  g) {
		this.g = g;
		return g;
	}
	public String toString() {
		return super.toString() + food;
	}

public static void main (String[] args) {
	
	int h = Animals.g; // *** �������� �� �� �������� ����. ���� �� ������ �� ��� ��������� ���� abstract ����� �� static (���. pubic static int g = 30;)
	System.out.println(h);
	
	Animals n = new Cat (1,3);
	System.out.println(n.a());
	System.out.println (n); // ��� �� ���������� � toString.
	//n.cat_method(40); ��� �������� �� ��� ���������������� �� ����� ��� ����� ��� ������ ��� Cat ������, ����� ��� �� ������ ������������ ��� ����������� cat.
	// ��� ������� �� down casting.
	((Cat) n).cat_method(40); // ����� ����� � ������ ������. ��� ���� ��� n. ������ ((Cat) n).
	
}
}

/*
��� ��� abstract ����� �� ������ �� ��������� ��� ��� ���� � ����� �� ���������� ���� ��� ������� ���.

�������� ��� ������� ���� ���� abstract ������� �� ������ �� ����� ������� ��� ������ ������ (�.�. ��� �� ���: ����� ��� ����)

��� ������� �������������/������� �������� ��� ����������� ���������ʢ ��� �� ���������� ��� ���� ����� ��� ��� ����� extend (��� abstract) ��� ����� �� ������������� ��� ������� �����������.

*** ��� ����� ���� ����� extends ��� abstract � ���� ����� ��������� ��� interface ����� ���� ������ ��� ��� �������������� �� �������� ��� ���� � ����� ������ ������������� ��������.

��������, ��� abstract �����, ������ �� ������� ��� ��� ������ ����� ��� ����� �� ���������� �� ����������.

*/