package mirea.isbo1016.mateyuk.pract3.zad1;

public class shapeTest {
    public static void main(String[] args) {
        shape[] arr = new shape[4];
            arr[0] = new circle(5, "red", true);
            arr[1] = new rectangle(4,7,"red", false);
            arr[2] = new square(12,"white",true);
            arr[3] = new square(5,"blue",false);

        for (shape shape : arr) {
                System.out.println(shape);
        }
    }
}
