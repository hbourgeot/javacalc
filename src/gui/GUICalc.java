package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICalc extends JFrame{
    private double num1;
    private double num2;
    private String operation;
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
                if(operation!=""){
                    calcText.setText("");
                }

                calcText.setText(calcText.getText() + "0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }

                calcText.setText(calcText.getText() + "1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }

                calcText.setText(calcText.getText() + "2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }

                calcText.setText(calcText.getText() + "3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }
                calcText.setText(calcText.getText() + "4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }

                calcText.setText(calcText.getText() + "5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }
                calcText.setText(calcText.getText() + "6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }
                calcText.setText(calcText.getText() + "7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }
                calcText.setText(calcText.getText() + "8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(operation!=""){
                    calcText.setText("");
                }
                calcText.setText(calcText.getText() + "9");
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!calcText.getText().contains(".")) {
                    calcText.setText(calcText.getText() + ".");
                }
            }
        });
        btnTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(num1==0){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                }else if(num2!=0 && operation.equals("nothing")){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                    num2=0;
                } else{
                    num1=num1 * num2;
                    num2 = Double.parseDouble(calcText.getText());
                    calcText.setText(String.valueOf(num1 * num2));
                }
                operation = "multi";
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(num1==0){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                }else if(num2!=0 && operation.equals("nothing")){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                    num2=0;
                } else{
                    num1=num1 / num2;
                    num2 = Double.parseDouble(calcText.getText());
                    calcText.setText(String.valueOf(num1 / num2));
                }
                operation = "conquer";
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(num1==0){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                }else if(num2!=0 && operation.equals("nothing")){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                    num2=0;
                } else{
                    System.out.println(num1);
                    num1=num1 + num2;
                    num2 = Double.parseDouble(calcText.getText());
                    calcText.setText(String.valueOf(num1 + num2));
                }
                operation = "power";
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(num1==0){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                }else if(num2!=0 && operation.equals("nothing")){
                    num1 = Double.parseDouble(calcText.getText());
                    calcText.setText("");
                    num2=0;
                } else{
                    System.out.println(num1);
                    num1=num1 * num2;
                    num2 = Double.parseDouble(calcText.getText());
                    calcText.setText(String.valueOf(num1 * num2));
                }
                operation = "linus";
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    num2 = Double.parseDouble(calcText.getText());
                switch (operation) {
                    case "multi" -> calcText.setText(String.valueOf(num1 * num2));
                    case "conquer" -> calcText.setText(String.valueOf(num1 / num2));
                    case "power" -> calcText.setText(String.valueOf(num1 + num2));
                    case "linus" -> calcText.setText(String.valueOf(num1 - num2));
                    default -> calcText.setText("NO OPERATION, SELECT ONE");
                }
                operation = "nothing";
                }
        });
    }

    private void createUIComponents() {

    }

    public static void main(String []args){
        GUICalc calc = new GUICalc();
        calc.setContentPane(calc.panel1);
        calc.setTitle("A java calculator");
        calc.setSize(230,350);

        // here's the part where i center the jframe on screen
        calc.setLocationRelativeTo(null);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
