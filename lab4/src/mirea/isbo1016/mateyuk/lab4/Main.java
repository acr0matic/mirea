package mirea.isbo1016.mateyuk.lab4;

public class Main {
    public static void main(String[] args) {

        Priceable car = new Audi(500000);
        Nameable planet = new Saturn("Saturn");

        Beer bud = new Beer("Bud", 75);

        System.out.println(car);
        System.out.println(bud);
        System.out.println(planet);
    }
}
