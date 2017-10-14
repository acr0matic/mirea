package mirea.isbo1016.mateyuk.lab2.human;

public class leg {
    public  int footSize;
    public  int lenght;

    leg()
    {

    }

    leg(int footSize, int length)
    {
        this.footSize = footSize;
        this.lenght = length;
    }

    public int getFootSize() {
        return footSize;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "leg{" +
                "footSize=" + footSize +
                ", lenght=" + lenght +
                '}';
    }
}
