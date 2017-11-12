package mirea.isbo1016.mateyuk.lab6.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class MouseListener extends JFrame {
    private JLabel southLabel = new JLabel("SOUTH");
    private JLabel northLabel = new JLabel("NORTH");
    private JLabel eastLabel = new JLabel("EAST");
    private JLabel westLabel = new JLabel("WEST");
    private JLabel centerLabel = new JLabel("CENTER");

    MouseListener()
    {
        this.setResizable(false);
        this.setSize(400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        southLabel.setHorizontalAlignment(JLabel.CENTER);
        northLabel.setHorizontalAlignment(JLabel.CENTER);
        eastLabel.setHorizontalAlignment(JLabel.CENTER);
        westLabel.setHorizontalAlignment(JLabel.CENTER);
        centerLabel.setHorizontalAlignment(JLabel.CENTER);

        southLabel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Добро пожалововать в Абха");

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        northLabel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в Каир");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        eastLabel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        westLabel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Добро пожаловать в Джидда");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        centerLabel.addMouseListener(new java.awt.event.MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Добро пожаловать, Странник!");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.add(southLabel, BorderLayout.SOUTH);
        this.add(northLabel, BorderLayout.NORTH);
        this.add(eastLabel, BorderLayout.EAST);
        this.add(westLabel, BorderLayout.WEST);
        this.add(centerLabel, BorderLayout.CENTER);

    }
}
