package SwingOtherClasses;
import javax.swing.JFrame; // � JFrame ����� ��� ����� ��� ��� ���������� Swing, ���� ����� ��� � JLable,Jbutton....
import javax.swing.JLabel;

/*
 *  �� ���� ���� �����, �������� �� ����������� ��� ���� �� ���������.
public class Example {

	public static void main (String [] args) {
JFrame a = new JFrame();
JLabel b = new JLabel("ghfdghfdhfg");
a.setSize (300,200);
a.setTitle("sfgdfgd");
a.setVisible(true);
a.getContentPane().add(b);
	}
}
*/
public class Example extends JFrame { //  ���� ��� ����� extends ��� JFrame, �������� �� ���������������� ��� �������� ���, ����� �� �������������� �����������.
	public static int Weight = 400;
	public static int Height = 400;
	public Example () { // ������������ ���� ������������, ��� �� ������������� ��� �����.
		super ();
		setSize (Weight, Height);
		setTitle ("First Window");
		getContentPane().add (new JLabel ("���� ��� �� ������"));
		//WindowDestroyer myListener = new WindowDestroyer ();
		//addWindowListener (myListener);
	}
	public Example (int a, int b, String Title, String Label) {
		super ();
		setSize (a, b);
		setTitle (Title);
		getContentPane().add (new JLabel (Label));
	}


public static void main (String [] args) {
	Example e = new Example ();	
	e.setVisible (true);
	Example v = new Example (400,500, "Second Window", "���� ��� �� ������");	
	v.setVisible (true);
}
}
//�� ���� �� ����������, ��������������� ��� �������������, ��� �� ��� ���������� 2 ������������, ���� ��������.