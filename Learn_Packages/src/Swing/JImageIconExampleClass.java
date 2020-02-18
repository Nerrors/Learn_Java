package Swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import javax.swing.ImageIcon;// �������: ��� ����� JImageIcon

import java.awt.Color ;
import java.awt.Container ;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import java.awt.Dimension;
import java.awt.Insets;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JImageIconExampleClass extends JFrame implements ActionListener {

private static int WEIGHT = 500;
private static int HEIGHT = 600;

	
public void method() {
	
	setSize (WEIGHT, HEIGHT);
	setTitle ("Window");
	
	Container content = getContentPane();
	content.setLayout(new BorderLayout());
	
	JPanel jp = new JPanel();
	jp.setBackground(Color.YELLOW);
	jp.setLayout(new BorderLayout());
	
	content.add(jp, BorderLayout.CENTER); //����������� �� JPanel ��� ������.
	
	JMenuBar jmb = new JMenuBar();
	jp.add(jmb);
	setJMenuBar(jmb); //������� �� ���� ��� �����.
	
	JMenu jm = new JMenu ("File");
	jmb.add(jm);
	
	JMenuItem jmi1 = new JMenuItem("Open");
	JMenuItem jmi2 = new JMenuItem("Exit");
	jm.add(jmi1);
	jm.add(jmi2);
	jmi1.addActionListener(this); // ������� ��� LISTENERS
	jmi2.addActionListener(this);
	
	//----------------���������� JPanel ��� �� Buttons------------------\\
	
	JPanel jp2 = new JPanel();
	jp2.setLayout(new FlowLayout());
	jp2.setBackground(Color.RED);
	content.add(jp2,BorderLayout.SOUTH);
	
	JButton button1 = new JButton ("Button1");
	JButton button2 = new JButton ("Button2");
	jp2.add(button1);
	jp2.add(button2);
	
	button2.setPreferredSize(new Dimension(60,80));
	button2.setMargin(new Insets (10,05,20,20)); // ���������� ���� �� JButtons.
	
	ImageIcon ii = new ImageIcon ("C:\\Program FiLes\\Microsoft Office\\Office14\\Groove\\ToolBMPs\\STOPICON.JPG");
	button1.setIcon(ii); //��� ��� ��� ������ add.	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	if (e.getActionCommand().equals("Open")) {
		JFrame jf1 = new JFrame("Second Window");  // �� ��� ������������ ��� ���� ����������� �� ������ �� �������� ��� ������ ��� ��� ��� �� ������������ ��� ���� ��������
		
		jf1.setSize (200, 200);
		jf1.setTitle ("Window");
		jf1.setVisible(true);
	}
	
	if (e.getActionCommand().equals("Exit")) {
	System.exit(0);	
	}
}

public static void main (String[] args) {
	JImageIconExampleClass jiic = new JImageIconExampleClass ();
	jiic.method();
	jiic.setVisible(true);
	}
}

/* �����������
 * 
 * public JButton (String text, ImageIcon picture)
 * public JLabel (String text, ImageIcon picture, int horizontalAlligment)
 * 
 * 
 */


