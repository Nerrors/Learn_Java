package Abstract_Interface;

public class main_Interface {

public static void main (String [] args) {
	
	Cat_Interface c;
	Monkey_Interface m;
	
	Animals_Interface g, f;
	
	c= new Cat_Interface (20, 30);
	m = new Monkey_Interface (20, 30);
	
	g = m;
	
double k = Animals_Interface.a;
System.out.println(k);	

	System.out.println(m.display(g));
	System.out.println(f.getPerimeter());	
	//System.out.println(m.display(f));
	/* Animals_Interface g;
	
	Cat_Interface c;
	Monkey_Interface m;
	c = new Cat_Interface (20, 30);
	m = new Monkey_Interface (20, 30);
	
	g = c;
	g = m;
	
	System.out.println((c.display(c)));
	System.out.println((m.display(m)));
	*/
}
}

/*
�������: � ����� ��� ������� ��� ����� ���������� �� ��� ������ ���.

�� ���� �� ����������� ��������� ��� ��������� ��� �� ����������� �� ���� ������.
��� ���� ��� ���� ������� ����� �� ����� ��� ������ ���� ��� ���������� ��� ������������ ��� ��� � ����� ��� ����������.

���� ��� ������ ��� interface a ��� 2 ������� b,c ��� ��� ���������.
���� ��� ���� ��� ������ ��� ������ dispay(<Interfacename name >).

���� ���� main �������� �� ���������������� ��� display, ��� �� ������ �� ��� ������� �� ����������� ��� �������������.
���� ����� ��� ����� ���������� ��� �������������.

���� ������ ��� ����� Person ��� ��� ���� ��� ��� ����� extends, ��� �� ���������� �� ���������������� ��� ���� ��� ������� ��� ������ ��� ���� �� ���� ����� ��� ��� ���� �����������.






*/
