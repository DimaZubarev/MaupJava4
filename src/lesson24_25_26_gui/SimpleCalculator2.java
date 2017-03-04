package lesson24_25_26_gui;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator2 extends JFrame{
    // JFrame  - головний контейнер
    // JTextField - це поле (10 - довжина поля)
    public static final String BUTTON_PLUS = "Plus";
    public static final String BUTTON_MINUS = "Minus";
    public static final String BUTTON_DIVISION = "Division";
    public static final String BUTTON_MULTIPLICATION = "Multiplication";

    private JTextField field1 = new JTextField(10);
    private JTextField field2 = new JTextField(10);
    private JTextField result = new JTextField(10);
    public SimpleCalculator2(String title) {
        super(title);
        JPanel panel = new JPanel();
        FlowLayout f1 = new FlowLayout();
        panel.setLayout(f1);
        JLabel label1 = new JLabel("Number 1: ");
        JLabel label2 = new JLabel("Number 2: ");
        JLabel label3 = new JLabel("Sum: ");
        JButton plus = new JButton("+");
        plus.setName(BUTTON_PLUS);
        JButton minus = new JButton("-");
        minus.setName(BUTTON_MINUS);
        JButton division = new JButton("/");
        division.setName(BUTTON_DIVISION);
        JButton multiplication = new JButton("*");
        multiplication.setName(BUTTON_MULTIPLICATION);

        Engine engine = new Engine(field1, field2, result);
        plus.addActionListener(engine);
        minus.addActionListener(engine);
        division.addActionListener(engine);
        multiplication.addActionListener(engine);

        panel.add(label1);
        panel.add(field1);
        panel.add(label2);
        panel.add(field2);
        panel.add(label3);
        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(division);
        panel.add(multiplication);
        this.setContentPane(panel);
        this.setSize(400, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    new SimpleCalculator2("Calculator").setVisible(true);
    }
}
