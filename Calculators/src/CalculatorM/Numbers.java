package CalculatorM;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JLabel;
	import javax.swing.JButton;
	import javax.swing.JTextField;
	import javax.swing.JComponent;
	import java.awt.Color;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.lang.NullPointerException;

	public class Numbers extends JFrame implements ActionListener {

	private JTextField tf; // Αυτό είναι πολύ σημαντικό..Εάν θέλουμε να το δηλώσουμε και σε άλλες μεθόδους.
	private double total1 = 0;
	public int flag = 0;
	public double total = 0.0;
	public int operator;
//private String s;
//private String s2;
//private double nums =  Double.parseDouble(s);
//private double nums2 =  Double.parseDouble(s2);
	private double s;
	private double s2;
	private double g;
	public Numbers () {
	super();	
	setTitle ("Calculator");
	setSize (300,180);
	JPanel p = new JPanel();
	tf = new JTextField("Hello", 20);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	

	JButton button0 = new JButton ("0");
	JButton button1 = new JButton ("1");
	JButton button2 = new JButton ("2");
	JButton button3 = new JButton ("3");
	JButton button4 = new JButton ("4");
	JButton button5 = new JButton ("5");
	JButton button6 = new JButton ("6");
	JButton button7 = new JButton ("7");
	JButton button8 = new JButton ("8");
	JButton button9 = new JButton ("9");
	JButton buttondel = new JButton ("-");
	JButton buttonplus = new JButton ("+");
	JButton buttonmult = new JButton ("*");
	JButton buttondiv = new JButton ("/");
	JButton buttonres = new JButton ("=");

	button0.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	buttondel.addActionListener(this);
	buttonplus.addActionListener(this);
	buttonmult.addActionListener(this);
	buttondiv.addActionListener(this);
	buttonres.addActionListener(this);

	tf.setBounds(30,40,280,30); // Ξ¤ΞΏ tf ΞµΞ―Ξ½Ξ±ΞΉ TextField
	button7.setBounds(40,100,50,40);
	button8.setBounds(110,100,50,40);
	button9.setBounds(180,100,50,40);
	buttondiv.setBounds(250,100,50,40);
	button4.setBounds(40,170,50,40);
	button5.setBounds(110,170,50,40);
	button6.setBounds(180,170,50,40);
	buttonmult.setBounds(250,170,50,40);
	button1.setBounds(40,240,50,40);
	button2.setBounds(110,240,50,40);
	button3.setBounds(180,240,50,40);
	buttondel.setBounds(250,240,50,40);      
	button0.setBounds(110,310,50,40);
	buttonres.setBounds(180,310,50,40);
	buttonplus.setBounds(250,310,50,40);

	p.add(tf);
	p.add(button0);  // getContentPane.add(button0);
	p.add(button1);
	p.add(button2);
	p.add(button3);
	p.add(button4);
	p.add(button5);
	p.add(button6);
	p.add(button7);
	p.add(button8);
	p.add(button9);
	p.add(buttondel);
	p.add(buttonplus);
	p.add(buttonmult);
	p.add(buttondiv);
	p.add(buttonres);
	//p.setBackground(Color.BLUE);
	setResizable(false); // Ξ”ΞµΞ½ ΞµΞ―Ξ½Ξ±ΞΉ ΞΌΞ­ΞΈΞΏΞ΄ΞΏΟ‚ Ο„Ξ·Ο‚ Panel, Ξ±Ξ»Ξ»Ξ¬ ΞΌΞ­ΞΈΞΏΞ΄ΞΏΟ‚ Ο„Ξ·Ο‚ JFrame.
	add(p);
	}

	public void actionPerformed (ActionEvent e)  {

	if (e.getActionCommand().equals("0")) {   // Ξ‰ if (e.getSource() == button0) {
	if (flag == 0) {
	tf.setText("0");
	flag = 0;
	 double s = Double.parseDouble(tf.getText());
	System.out.println(s);
	}
	else {
		tf.setText("0");
		double s2 = Double.parseDouble(tf.getText());
		System.out.println(s2);
	}
	}
	else if (e.getActionCommand().equals("1")) {
		if (flag == 0) {
	tf.setText("1");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
		tf.setText("1");
		double s2 = Double.parseDouble(tf.getText());
		System.out.println(s2);
		}
		}
	
	else if (e.getActionCommand().equals("2")) {
		if (flag == 0) {
	tf.setText("2");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
	else {
		tf.setText("2");
		double s2 = Double.parseDouble(tf.getText());
		System.out.println(s2);
		}
	}
	
	else if (e.getActionCommand().equals("3")) {
		if (flag == 0) {
	tf.setText("3");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
	}
	else {
		tf.setText("3");
		double s2 = Double.parseDouble(tf.getText());
		System.out.println(s2);
	}
	}
	else if (e.getActionCommand().equals("4")) {
		if (flag == 0) {
	tf.setText("4");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
			tf.setText("4");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("5")) {
		if (flag == 0) {
	tf.setText("5");
	flag = 0;
	double s = Double.parseDouble(tf.getText());;
	System.out.println(s);
		}
		else {
			tf.setText("5");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("6")) {
		if (flag == 0) {
	tf.setText("6");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
			tf.setText("6");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("7")) {
		if (flag == 0) {
	tf.setText("7");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
			tf.setText("7");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("8")) {
		if (flag == 0) {
	tf.setText("8");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
			tf.setText("8");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("9")) {
		if (flag == 0) {
	tf.setText("9");
	flag = 0;
	double s = Double.parseDouble(tf.getText());
	System.out.println(s);
		}
		else {
			tf.setText("9");
			double s2 = Double.parseDouble(tf.getText());
			System.out.println(s2);
		}
		}
	else if (e.getActionCommand().equals("+")) {
		double s = Double.parseDouble(tf.getText());
		tf.setText("+");
	flag = 1;
	operator = 1;
	
	System.out.println(s);
	}
	else if (e.getActionCommand().equals("-")) {
		double s = Double.parseDouble(tf.getText());
		tf.setText("-");
	flag = 1;
	operator = 2;
	}
	else if (e.getActionCommand().equals("*")) {
		double s = Double.parseDouble(tf.getText());
		tf.setText("*");
	flag = 1;
	operator = 3;
	}
	else if (e.getActionCommand().equals("/")) {
		double s = Double.parseDouble(tf.getText());
		tf.setText("/");
	flag = 1;
	operator = 4;
	System.out.println(s);
	System.out.println(s2);
	}
	else if (e.getActionCommand().equals("=")) {
		if (operator == 1) {
			double s = Double.parseDouble(tf.getText());
			double s2 = Double.parseDouble(tf.getText());
			System.out.println("wefwfwef" + s + s2);
			 total1 = s + s2;
			 System.out.println(s+s2);
			 tf.setText(""+(s + s2));
			 //tf.setText(Double.parseDouble(tf.getText()));
			 
			 /*ready = textField.getText();
			 valueA = Float.parseFloat(ready);
			 valueB = Float.parseFloat(ready);
             textField.setText("" + (valueA + valueB));
             */
		}	
		else if (operator == 2) {
			 total1 = s - s2;
			 tf.setText(" "+(s));
			 System.out.println(s);
			 System.out.println(s2);
		}
		else if (operator == 3) {
			 total1 = s * s2;
			tf.setText("*");
		}
		else if (operator == 4) {
			 total1 = s / s2;
			tf.setText("=");
		}
	}
	else 
	{
	System.out.println("dasdasdasda");
		//total1 =  tf.getText(); 
	}
	}
	public static void main (String [] args) {
		Numbers n = new Numbers ();
	n.setVisible(true); // Ξ•Ξ¬Ξ½ Ξ΄ΞµΞ½ ΞµΞ―Ο‡Ξ±ΞΌΞµ Ο„ΞΏ setvisible, ΞΌΟ€ΞΏΟ�ΞΏΟ�ΟƒΞ±ΞΌΞµ Ξ½Ξ± Ξ³Ο�Ξ¬Ο†Ξ±ΞΌΞµ ΞΌΟ�Ξ½ΞΏ new Numbers ();
	}
	}
	
	
	/*public void Numbers () {
	switch (operator) {
	case 1:
	total = tf.getText() + 
	break;
	case 2:

	break;
	case 3:

	break;
	case 4:

	break;


	}
	*/


