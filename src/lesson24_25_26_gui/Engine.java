package lesson24_25_26_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Engine implements ActionListener, KeyListener{
    private JTextField xFild;
    private JTextField yFild;
    private JTextField zFild;

    public Engine(JTextField xFild, JTextField yFild, JTextField zFild) {
        this.xFild = xFild;
        this.yFild = yFild;
        this.zFild = zFild;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String operation = ((JButton)e.getSource()).getName();
        double x = 0;
        double y = 0;
        JTextField errorFild = null;
            try {
                errorFild = xFild;
                x = Double.parseDouble(xFild.getText());
                errorFild = yFild;
                y = Double.parseDouble(yFild.getText());
                if(operation.equals(SimpleCalculator2.BUTTON_PLUS)) zFild.setText(x + y + " ");
                if(operation.equals(SimpleCalculator2.BUTTON_MINUS)) zFild.setText(x - y + " ");
                if(operation.equals(SimpleCalculator2.BUTTON_DIVISION)) zFild.setText(x / y + " ");
                if(operation.equals(SimpleCalculator2.BUTTON_MULTIPLICATION)) zFild.setText(x * y + " ");
            } catch (NumberFormatException e1) {
                JOptionPane.showConfirmDialog(null, "Error in number typed!", " Error!",
                        JOptionPane.PLAIN_MESSAGE);
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
