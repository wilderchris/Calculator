package Main.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Calc extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear;
    private double firstNumber, secondNumber, result;
    private String operation;

    public Calc() {
        super("Calc");
    }
    public void GUI() {
        textField = new JTextField(20);
        
        textField.setFont(new Font("Arial", Font.BOLD, 50));
        
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("C");

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
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDiv);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMul);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonSub);
        panel.add(button0);
        panel.add(buttonClear);
        panel.add(buttonEqual);
        panel.add(buttonAdd);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(textField, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if (source == button0) {
            textField.setText(textField.getText() + "0");
        } else if (source == button1) {
            textField.setText(textField.getText() + "1");
        } else if (source == button2) {
            textField.setText(textField.getText() + "2");
        } else if (source == button3) {
            textField.setText(textField.getText() + "3");
        } else if (source == button4) {
            textField.setText(textField.getText() + "4");
        } else if (source == button5) {
            textField.setText(textField.getText() + "5");
        } else if (source == button6) {
            textField.setText(textField.getText() + "6");
        } else if (source == button7) {
            textField.setText(textField.getText() + "7");
        } else if (source == button8) {
            textField.setText(textField.getText() + "8");
        } else if (source == button9) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonClear) {
            textField.setText("");
            firstNumber = 0;
            secondNumber = 0;
            result = 0;
        } else if (source == buttonAdd) {
            firstNumber = Double.parseDouble(textField.getText());
            operation = "+";
            textField.setText("");
        } else if (source == buttonSub) {
            firstNumber = Double.parseDouble(textField.getText());
            operation = "-";
            textField.setText("");
        } else if (source == buttonMul) {
            firstNumber = Double.parseDouble(textField.getText());
            operation = "*";
            textField.setText("");
        } else if (source == buttonDiv) {
            firstNumber = Double.parseDouble(textField.getText());
            operation = "/";
            textField.setText("");
        } else if (source == buttonEqual) {
            secondNumber = Double.parseDouble(textField.getText());

            try {
            if (operation.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operation.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operation.equals("/")) {
                result = firstNumber / secondNumber;
            }
            
            textField.setText(Double.toString(result));
            firstNumber = result;
            operation = "";
            secondNumber = 0;
            }catch(Exception e) {
            	JOptionPane.showMessageDialog(null, "Must choose an operation [+, -, *, /] before pressing equals");

            System.out.println("only equals entered: " + e);

            }
            
            
        }
    }

    }
