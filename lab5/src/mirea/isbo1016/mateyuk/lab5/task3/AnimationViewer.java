package mirea.isbo1016.mateyuk.lab5.task3;

import javax.swing.*;
import java.awt.*;

public class AnimationViewer extends JFrame{
    private JButton stopButton = new JButton("Stop");
    private JButton startButton = new JButton("Start");

    AnimationViewer()
    {
        PictureComponent Animation = new PictureComponent();

        stopButton.addActionListener(e -> PictureComponent.num = 5);
        startButton.addActionListener(e -> PictureComponent.num = PictureComponent.bufferNum);

        add(Animation);
        add(stopButton, BorderLayout.NORTH);
        add(startButton, BorderLayout.SOUTH);

        this.setTitle("Animation");
        this.setResizable(false);
        this.setSize(Animation.images[0].getWidth(null),
                Animation.images[0].getHeight(null) + 85);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


}
