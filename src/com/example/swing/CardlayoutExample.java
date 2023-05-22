package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardlayoutExample{
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        CardLayout layout = new CardLayout();
        pane.setLayout(layout);

        for(int i =0; i < 5; i++) {
            JButton b = new JButton("" + i);
            pane.add(b, "button" + i);
            final int num = i;
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int nextId = num + 1;
                    if(nextId >= 5) nextId = 0;
                    layout.show(pane, "button" + nextId);
                }
            });

        }

        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
