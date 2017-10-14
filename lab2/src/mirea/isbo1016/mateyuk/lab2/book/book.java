package mirea.isbo1016.mateyuk.lab2.book;

import java.util.Scanner;

public class book {
    private int cost, year;
    private String name;
    private String author;
    private boolean isCosted = true;
    private boolean isAuthored = true;
    private  boolean isYeared = true;

    private Scanner input = new Scanner(System.in);

    public book(String n, String a, int y, int c) {
        author = a;
        name = n;
        cost = c;
        year = y;
        costControl();
    }

    public book(String n, String a, int c) {
        author = a;
        name = n;
        cost = c;
        year = 0;
        isYeared = false;
    }

    public book(String n, String a)
    {
        author = a;
        name = n;
        cost = 0;
        year = 0;
        isYeared = false;
        isCosted = false;
    }

    public book(String n, int y, int c)
    {
        author = "Unknown";
        name = n;
        cost = c;
        year = y;
        isAuthored = false;
    }

    public void getInfo() {
        System.out.println("Author: " + author + "\n" + " Book: " + name + "\n" + " Year publication: " + year + "\n" + " Cost: " + cost + "\n");

        if (!isAuthored)
            setAuthor();
        if (!isCosted)
            setCost();
        if (!isYeared)
            setYear();
    }

    public void getBook() {
        System.out.println(name);
    }

    public void setAuthor() {
            System.out.println("Enter author name: ");
            author = input.nextLine();
            isAuthored = true;
    }

    public void setCost() {
            System.out.println("Enter cost: ");
            cost = input.nextInt();
            isCosted = true;
            costControl();
    }
    public void setYear()
    {
        System.out.println("Enter year: ");
        year = input.nextInt();
        isYeared = true;
    }

    private void costControl() {
        if (cost > 200)
            cost = 200;
        else if (cost < 5)
            cost = 1;
    }
}
