package SwingOtherClasses;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout; // �������� ��� ����� 2 �������� �������: 1)import java.awt.FlowLayout; ��� 2) import java.awt.GridLayout;
public class Example_3_Layouts extends JFrame {
public Example_3_Layouts () {
	super();
	setSize (400, 500);
	setTitle ("First Window");
	getContentPane().setBackground(Color.YELLOW);
	getContentPane().add (new JLabel ("���� ��� �� ������"), BorderLayout.CENTER);
	
	getContentPane().setLayout(new BorderLayout()); // �������
	getContentPane().add (new JLabel ("���� ��� �� ������_2"), BorderLayout.NORTH);
}
public static void main (String [] args) {
	Example_3_Layouts a = new Example_3_Layouts ();
	a.setVisible(true);
}
}
