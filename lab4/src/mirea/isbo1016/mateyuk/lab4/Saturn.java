package mirea.isbo1016.mateyuk.lab4;

public class Saturn implements Nameable{
    private String name;

    public Saturn(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Saturn{" +
                "name = " + name +
                '}';
    }
}
