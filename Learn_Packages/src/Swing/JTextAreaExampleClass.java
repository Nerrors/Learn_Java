package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.JScrollPane; //�������� �� ������������ �� ����������� ��� JTextArea

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JTextAreaExampleClass extends JFrame {

	private static int WEIGHT = 600;
	private static int HEIGHT = 400;
	
	private static int LINES = 10;
	private static int CHAR_PER_LINE = 20;
	
	public void method() {
		setTitle("fdfsdf");
		setSize(WEIGHT,HEIGHT);
		setVisible(true); // ��� �������� �� ��� ������� ����.
		
		Container content = getContentPane();
		content.setLayout(new BorderLayout());
		JPanel jp = new JPanel();
		jp.setBackground(Color.YELLOW);
		jp.setLayout(new FlowLayout()); // �� ������� BorderLayout �� ��������� ��� �������� ��� ��� �� �������� �� ����� TextArea.
		content.add(jp, BorderLayout.CENTER);
		
		JTextArea jta = new JTextArea(LINES, CHAR_PER_LINE);
		jp.add(jta);
		
		JScrollPane jsp = new JScrollPane(jta);
		jp.add(jsp); // ������ ��� ���� �� �� ����������� ��� ���� JPanel ��� ��������� ��� �� ����������� JTextArea.
		
		/* ��������������� ��� 2 �������� �������� ��� �� ������������ ����� �� ScrollPane.
		
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		�������� �� ������� ���� ALWAYS, ���� NEVER, ���� AS_NEEDED. ���� ��������������, ����� �� ����� ����� int �������.
		
		*/
	}
	
	public static void main (String [] args) {		
		JTextAreaExampleClass jtaec = new JTextAreaExampleClass();
		jtaec.method();
		jtaec.setVisible(true); // ��� ����� ������� � ������� setVisible(true).������ �� ������� ���� ��� ������.
	}
}
