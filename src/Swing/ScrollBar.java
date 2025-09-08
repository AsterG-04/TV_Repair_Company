/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing;

/**
 *
 * @author ACER
 */

import javax.swing.*;
import java.awt.*;


public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        // Set the custom UI for the scrollbar
        setUI(new ModernScrollBarUI());

        // Set preferred size and background color
        setPreferredSize(new Dimension(5, 5));
        setBackground(new Color(242, 242, 242));

        // Set unit increment for scrolling
        setUnitIncrement(20);
    }

    public static void main(String[] args) {
        // Create a JFrame to demonstrate the custom scrollbar
        JFrame frame = new JFrame("Custom Scroll Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with a text area and add the custom scrollbar
        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the custom scrollbar to the scroll pane
        scrollPane.setVerticalScrollBar(new ScrollBar());

        panel.add(scrollPane);
        frame.add(panel);

        frame.setVisible(true);
    }
}