package Swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color; // � AWR ����� ��� ������ �������, ��� � Color ��������� �� ���� �� ������ (���� ��� � Container).
import java.awt.Container;

public class ColorExampleClass extends JFrame {
	public ColorExampleClass () {
		super ();
		
		setTitle ("First Window");
		setSize (400, 500);
		getContentPane().setBackground(Color.YELLOW);
		//addWinmdowListener (new WindowDestroyer());
	}
	public static void main (String [] args) {
		ColorExampleClass e = new ColorExampleClass ();	
		e.setVisible (true);
		}
	}
/* *** ��� ������������ ��� ��� ��� ������� �� ��� �������� ����� ������ � main ������������� ��� ����������� ��� ������ ��� ������ �� ����� ��� ��� �������� ��� JFrame.
public class Example_2_Colors {
private JFrame p;

public Example_2_Colors () {
super();
p.setTitle("dcs");
p.setSize (...,...);

***

*/