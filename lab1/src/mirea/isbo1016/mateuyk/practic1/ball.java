package mirea.isbo1016.mateuyk.practic1;

import java.util.Scanner;

public class ball {
    private int size;
    private String color = new String();

    private Scanner input = new Scanner(System.in);

    public ball(String n, int y)
    {
        size = y;
        sizeControl();
        color = n;
    }

    public ball(int y)
    {
        size = y;
        sizeControl();
        color = "White";
    }
    public ball()
    {
        size = 0;
        color = "White";
    }

    public void getInfo()
    {
        System.out.print(color+ " ");
        System.out.print(size + " \n");
    }

    public void setSize()
    {
        size = input.nextInt();
        sizeControl();
    }
    private void sizeControl()
    {
        if (size > 25)
            size = 25;
        else if (size < 2)
            size = 2;
    }
}
