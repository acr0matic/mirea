package mirea.isbo1016.mateyuk.lab5.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PictureComponent extends JComponent {

    public Image[] images = new Image[5];
    public static int num;
    public static int bufferNum;


    PictureComponent()

    {
        try
        {
             for (int i = 0; i < images.length; i++) {
                images[i] = ImageIO.read(new File("C:/animatio/bat" + i + ".png"));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Timer period = new Timer(500, e ->  {

                if (num != 5)
                {
                    repaint();
                    if (num == 4) num = 0;
                    else num++;
                    bufferNum = num;
                }
        });
            period.start();
    }

    public void paintComponent(Graphics draw)
    {
        if (images[num] == null) return;
        draw.drawImage(images[num],0,0,null);

    }

}
