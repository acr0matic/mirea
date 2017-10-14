package mirea.isbo1016.mateyuk.pract3.zad1;

public class square extends rectangle{
    protected double side;

    square()
    {

    }
    square (double side)
    {
        this.side = side;
    }
    square (double side, String color, Boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        setLength(side);
        setWidth(side);
        return "Shape: square, side: " + this.side + ", color: " + this.color + ", perimeter: " + getPerimetr() + ", area: " + getArea();
    }
}
