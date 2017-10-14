package mirea.isbo1016.mateyuk.lab3.task2;

public abstract class Dog {

    protected int weight;
    protected String color;
    protected boolean isMale;


    Dog ()
    {

    }


    public Dog(int weight, boolean isMale) {
        this.weight = weight;
        this.isMale = isMale;
    }


    public boolean isMale() {
        return isMale;
    }

    public int getWeight() {
        return weight;
    }

    protected abstract String getColor();

}
