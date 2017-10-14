package mirea.isbo1016.mateyuk.pract3.zad1;

public abstract class shape {

    protected Boolean filled;
    protected String color;


    public shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public shape()
    {

    }

    public abstract double getArea();
    public abstract double getPerimetr();

    public String getColor()
    {
        return color;
    }

    public Boolean isFilled()
    {
        return filled;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setFilled(Boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        return " ";
    }

}
