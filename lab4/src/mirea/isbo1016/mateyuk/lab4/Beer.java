package mirea.isbo1016.mateyuk.lab4;

public class Beer implements Nameable, Priceable {

    private String name;
    private int cost;

    public Beer(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name = " + name  +
                ", cost = " + cost +
                '}';
    }
}
