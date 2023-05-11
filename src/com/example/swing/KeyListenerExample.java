package com.example.swing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class KeyListenerExample extends JFrame
        implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key typed " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key released " + e.getKeyChar());
    }

    public static void main(String[] args) {

        KeyListenerExample frame = new KeyListenerExample();

        frame.addKeyListener(frame);

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window gained focus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window lost focus.");
            }
        });

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}

