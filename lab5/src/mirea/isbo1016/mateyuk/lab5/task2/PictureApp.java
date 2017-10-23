package mirea.isbo1016.mateyuk.lab5.task2;

public class PictureApp {

    public static String path;

    public static void main(String[] args){

        path = args[0];

        PictureViewer app = new PictureViewer();
        app.setVisible(true);

    }
}
