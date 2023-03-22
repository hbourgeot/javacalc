package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalc extends JFrame{
    private JPanel panel1;
    private JTextField calcText;
    private JButton btn7;
    private JButton btnTimes;
    private JButton btn4;
    private JButton btnDivide;
    private JButton btn1;
    private JButton btnPlus;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btn0;
    private JButton btnDecimal;
    private JButton btnEqual;
    private JButton btnMinus;

    public GUICalc() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcText.setText("0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcText.setText(calcText.getText() + "1");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String []args){
        GUICalc calc = new GUICalc();
        calc.setContentPane(calc.panel1);
        calc.setTitle("A java calculator");
        calc.setSize(230,350);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
