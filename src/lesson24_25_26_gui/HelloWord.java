package lesson24_25_26_gui;

import javax.swing.*;

public class HelloWord extends JFrame{
    public HelloWord(){
        setSize(200,300);
        setTitle("Hello World");
        JButton myButton = new JButton("Click me");
        add(myButton);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloWord helloWord = new HelloWord();
    }
}
