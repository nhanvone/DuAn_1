/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourClassName extends JFrame {
    private boolean buttonPressed = false;

    public YourClassName() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        int buttonWidth = 100;
        int buttonHeight = 100;

        JButton button = new JButton("Click me!");
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!buttonPressed) {
                    JOptionPane.showMessageDialog(null, "Button Pressed!");
                    buttonPressed = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Button Already Pressed!");
                }
            }
        });

        panel.add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new YourClassName());
    }
}

