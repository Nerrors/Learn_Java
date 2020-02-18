package Fail_Java_Programs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel PanelMain;
    private JTextField textField;
    private JButton Buttonback;
    private JButton ButtonCE;
    private JButton ButtonC;
    private JButton ButtonPM;
    private JButton ButtonSqr;
    private JButton Button7;
    private JButton Button4;
    private JButton Button1;
    private JButton ButtonZero;
    private JButton ButtonEqual;
    private JButton ButtonPlus;
    private JButton ButtonDot;
    private JButton Button8;
    private JButton Button9;
    private JButton Button5;
    private JButton Button6;
    private JButton ButtonDiv;
    private JButton ButtonPer;
    private JButton ButtonMul;
    private JButton ButtonX;
    private JButton Button2;
    private JButton Button3;
    private JButton ButtonMinus;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }


        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //frame.setSize(295,250);
        frame.setResizable(false);

        //Получаем размеры окна
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        //Выравниваем по центру экрана
        frame.setLocation (screenWidth / 2 - frame.getWidth()/2, screenHeight / 2 - frame.getHeight() / 2);
    }
    String ready = "";
    float valueA = 0;
    float valueB = 0;

    public Calculator() {

        Button1.addActionListener(new ActionListener() {
            @Override                                           //1
            public void actionPerformed(ActionEvent e) {
                ready = ready + "1";
                textField.setText(ready);
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override                                           //2
            public void actionPerformed(ActionEvent e) {
                ready = ready + "2";
                textField.setText(ready);

            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override                                           //3
            public void actionPerformed(ActionEvent e) {
                ready = ready + "3";
                textField.setText(ready);
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override                                           //4
            public void actionPerformed(ActionEvent e) {
                ready = ready + "4";
                textField.setText(ready);
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override                                           //5
            public void actionPerformed(ActionEvent e) {
                ready = ready + "5";
                textField.setText(ready);
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override                                           //6
            public void actionPerformed(ActionEvent e) {
                ready = ready + "6";
                textField.setText(ready);
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override                                           //7
            public void actionPerformed(ActionEvent e) {
                ready = ready + "7";
                textField.setText(ready);
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override                                           //8
            public void actionPerformed(ActionEvent e) {
                ready = ready + "8";
                textField.setText(ready);
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override                                           //9
            public void actionPerformed(ActionEvent e) {
                ready = ready + "9";
                textField.setText(ready);
            }
        });
        ButtonZero.addActionListener(new ActionListener() {
            @Override                                           //0
            public void actionPerformed(ActionEvent e) {
                ready = ready + "0";
                textField.setText(ready);
            }
        });
        ButtonDot.addActionListener(new ActionListener() {      //.
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ready == ""){
                    ready = ready + "0.";
                    textField.setText(ready);
                }else
                if (ready.indexOf('.') == -1){
                    ready = ready + ".";
                    textField.setText(ready);
                }
            }
        });
        ButtonPM.addActionListener(new ActionListener() {       // PM
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = textField.getText();
                if (ready.indexOf('-') == -1){
                    ready = textField.getText();
                    ready = "-" + ready;            //if we haven`t '-' in string
                    textField.setText(ready);
                    ready = "";

                }else{
                    ready = textField.getText();
                    ready = ready.substring(1);        //if we haven '-' in string
                    textField.setText(ready);
                    ready = "";
                }
            }
        });
        ButtonC.addActionListener(new ActionListener() {        //C
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
                ready = "";
            }
        });
        ButtonCE.addActionListener(new ActionListener() {       //CE
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
                ready = "";
            }
        });
        Buttonback.addActionListener(new ActionListener() {     // back
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ready = textField.getText();
                    ready =  ready.substring(0, ready.length() - 1);
                    textField.setText(ready);
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "There are no chars in the field to remove !");
                }
            }
        });
        ButtonSqr.addActionListener(new ActionListener() {      //sqrt
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = textField.getText();
                textField.setText("" + Math.sqrt(Double.parseDouble(ready)));
                ready = "";
            }
        });
        ButtonX.addActionListener(new ActionListener() {        //1/x
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = textField.getText();
                textField.setText("" + (1/(Float.parseFloat(ready))));
                ready = "";
            }
        });
        ButtonPer.addActionListener(new ActionListener() {      //x^2
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = textField.getText();
                textField.setText("" + (Double.parseDouble(ready)*Double.parseDouble(ready)));
                ready = "";
            }
        });
        ButtonPlus.addActionListener(new ActionListener() {     //+
            @Override
            public void actionPerformed(ActionEvent e) {
                //ready = ready + "+";
                //textField.setText(ready);

                //valueB = Float.parseFloat(ready);
                //System.out.println(valueB);
                ready = textField.getText();
                valueA = Float.parseFloat(ready);
                ready = "";
                textField.setText("");

                //textField.setText("" + (valueA + valueB));



            }
        });
        ButtonMinus.addActionListener(new ActionListener() {        //-
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = ready + "";
                textField.setText(ready);
            }
        });
        ButtonMul.addActionListener(new ActionListener() {          //*
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = ready + "";
                textField.setText(ready);
            }
        });
        ButtonDiv.addActionListener(new ActionListener() {          //  /
            @Override
            public void actionPerformed(ActionEvent e) {
                ready = ready + "";
                textField.setText(ready);
            }
        });
        ButtonEqual.addActionListener(new ActionListener() {        // =
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                System.out.println(valueB);
                ready = "";
                textField.setText("" + (valueA+valueB));
                 */
                ready = textField.getText();
                valueB = Float.parseFloat(ready);
                textField.setText("" + (valueA + valueB));

            }
        });







    }
}