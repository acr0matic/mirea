package mirea.isbo1016.mateyuk.pract3.zad2;

public class release {
    public static void main(String[] args) {
        movable H = new movablePoint(2,5,2,2);
        movable B = new movableCircle(10, 2, 5,5, 15);
        System.out.println(H);

        H.moveUp();
        H.moveLeft();

        System.out.println(H);

        H.moveDown();
        H.moveRight();

        System.out.println(H);

        System.out.println();

        System.out.println(B);

        B.moveUp();

        System.out.println(B);

        B.moveLeft();

        System.out.println(B);

    }
}
