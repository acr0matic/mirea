package mirea.isbo1016.mateyuk.lab2.circle;

public class Circle {

    private double radius;
    private String color;
    private double area;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }

    public Circle(String c) {
        radius = 1.0;
        color = c;
    }

    public Circle(double r) {
        radius = r;
        color = "Red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area = radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}