package com.example.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class  MyIcon implements Icon {
    Color color;
    String text;

    public MyIcon(Color color, String text) {
        this.color = color;
        this.text = text;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.drawString(text,10,10);
    }

    @Override
    public int getIconWidth() {
        return 32;
    }

    @Override
    public int getIconHeight() {
        return 32;
    }
}

public class JCheckboxExample extends JFrame {
    public static void main(String[] args) {
        JCheckboxExample frame =
                new JCheckboxExample();

        JCheckBox check1 = new JCheckBox("Opcja 1");
        check1.setSelected(true);

        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (e.getStateChange()) {
                    case ItemEvent.SELECTED:
                        System.out.println("check1 selected");
                        break;
                    case ItemEvent.DESELECTED:
                        System.out.println("check1  deselected");
                        break;
                }
            }
        });

        check1.setBounds(10,10,100,50);
        frame.add(check1);

        MyIcon normal = new MyIcon(Color.BLACK,"Normal");
        MyIcon rollover = new MyIcon(Color.RED, "Rollover");
        MyIcon selected = new MyIcon(Color.GREEN,"Selected");

        JCheckBox check2 = new JCheckBox(normal);
        check2.setRolloverIcon(rollover);
        check2.setSelectedIcon(selected);

        check2.setBounds(10,80,100,50);
        frame.add(check2);

        frame.setLayout(null);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
