package mirea.isbo1016.mateuyk.practic1;
import java.util.Scanner;

public class book {
    private int cost, year;
    private String name = new String();
    private String author = new String();

    private  Scanner input = new Scanner(System.in);

    public book(String n, String a, int y, int c )
    {
        author = a;
        name = n;
        cost = c;
        year = y;
        costControl();
    }

    public book(String n, String a, int y)
    {
        author = a;
        name = n;
        cost = y;
        year = 0;
    }
    public book(String n, String a)

    {
        author = a;
        name = n;
        cost = 0;
        year = 0;
    }

    public void getInfo()
    {
        System.out.print(name+ " ");
        System.out.print(year + " ");
        System.out.print(cost + " \n");
    }

    public void setCost()
    {
        cost = input.nextInt();
        costControl();
    }
    private void costControl()
    {
        if (cost > 200)
            cost = 200;
        else if (cost < 5)
            cost = 1;
    }
}
