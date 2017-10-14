package mirea.isbo1016.mateyuk.pract3.zad1;

public class circle extends shape {

    protected double radius;

    circle()
    {

    }
    circle(double radius)
    {
        this.radius = radius;
    }

    circle(double radius, String color, Boolean fiiled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = fiiled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getPerimetr()
    {
        return Math.PI * radius * 2;
    }
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString()
    {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color + ", perimeter: " + getPerimetr() + ", area: " + getArea();
    }

}
