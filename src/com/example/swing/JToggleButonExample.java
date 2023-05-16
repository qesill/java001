package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButonExample extends JFrame {
    public static void main(String[] args) {

        JToggleButonExample frame = new JToggleButonExample();

        JToggleButton toggleButton = new JToggleButton("Click me!");
        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected: " + toggleButton.isSelected());
            }
        });

        frame.add(toggleButton);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
