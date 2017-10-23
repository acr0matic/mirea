package mirea.isbo1016.mateyuk.lab5.task1;

import javax.swing.*;
import java.awt.*;

public class ShapeViewer extends JFrame{

    private JPanel window = new JPanel(new GridLayout(5,4));
    private  JButton reloadFigures = new JButton("RELOAD");

    public ShapeViewer()
    {
        this.setSize(500,400);
        this.setTitle("Random Shapes");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        getContentPane().add(reloadFigures, BorderLayout.SOUTH);
        getContentPane().add(window = new ShapeDrawer());

        reloadFigures.addActionListener(e -> { window = new ShapeDrawer();
            revalidate();
            repaint();
        });
    }
}
