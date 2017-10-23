package mirea.isbo1016.mateyuk.lab5.task1;

import mirea.isbo1016.mateyuk.lab5.task1.figures.Circle;
import mirea.isbo1016.mateyuk.lab5.task1.figures.Rectangle;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawer extends JPanel {

    public void paint(Graphics figure)
    {
        int chooser;
        int common;

        for (int i = 0; i < 20; i++) {
            chooser = 0 + (int) (Math.random() * 5);
            if (chooser == 1) {
                Shape rectangle = new Rectangle();
                figure.setColor(rectangle.setColor());
                figure.fillRect(rectangle.positionX,rectangle.positionY,
                        rectangle.FirstParameters(), rectangle.SecondParameters());
            }
            else if (chooser == 2) {
                Shape circle = new Circle();

                common = circle.FirstParameters();

                figure.setColor(circle.setColor());
                figure.fillOval(circle.positionX,circle.positionY,
                        common, common);
            }
            else if (chooser == 3) {
                Shape oval = new Circle();
                figure.setColor(oval.setColor());
                figure.fillOval(oval.positionX,oval.positionY,
                        oval.FirstParameters(),oval.SecondParameters());
            }
            else if (chooser == 4) {
                Shape rectangle = new Rectangle();

                common = rectangle.FirstParameters();

                figure.setColor(rectangle.setColor());
                figure.fillRect(rectangle.positionX,rectangle.positionY,
                        common, common);
            }
        }
    }

}
