package mirea.isbo1016.mateyuk.lab5.task2;

import javax.swing.*;


public class PictureViewer extends JFrame {

    public PictureViewer(){
        PictureComponent comp  = new PictureComponent();
        add(comp);
        this.setSize(comp.image.getWidth(null) + 20,
                comp.image.getHeight(null)+ 30);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
