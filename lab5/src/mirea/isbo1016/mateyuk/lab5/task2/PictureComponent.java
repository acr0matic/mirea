package mirea.isbo1016.mateyuk.lab5.task2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class PictureComponent extends JPanel {

    public Image image;

    public PictureComponent() {


        try {
            image = ImageIO.read(new File(PictureApp.path));
        }
        catch (IOException e) {
                e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g) {
        if (image == null) return;
        g.drawImage(image, 0 , 0,null);
    }

}
