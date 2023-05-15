package com.example.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class JOptionPaneShowMessageDialog extends JFrame {
    public static void main(String[] args) {
        JOptionPaneShowMessageDialog frame =
                new JOptionPaneShowMessageDialog();

        /*JOptionPane.showMessageDialog(frame, "Hello Woarld!",
                "Title",
                JOptionPane.PLAIN_MESSAGE);*/

        ImageIcon icon = new ImageIcon("files//stock-illustration-8081282-black-compass-rose.jpg");

        JOptionPane.showMessageDialog(null,
                "<html><u>Hello Woarld!</u></html>",
                "Title",
                JOptionPane.ERROR_MESSAGE,
                icon);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        //frame.setVisible(true);
    }
}
