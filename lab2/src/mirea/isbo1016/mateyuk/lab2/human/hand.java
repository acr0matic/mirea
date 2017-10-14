package mirea.isbo1016.mateyuk.lab2.human;

public class hand {

    private int lenght;
    private boolean tattoo;

    public hand() {
    }

    public hand(int lenght, boolean tattoo) {
        this.lenght = lenght;
        this.tattoo = tattoo;
    }

    public int getLenght() {
        return lenght;
    }

    public boolean isTattoo() {
        return tattoo;
    }

    public void setTattoo(boolean tattoo) {
        this.tattoo = tattoo;
    }

    @Override
    public String toString() {
        return "hand{" +
                "lenght=" + lenght +
                ", tattoo=" + tattoo +
                '}';
    }
}
