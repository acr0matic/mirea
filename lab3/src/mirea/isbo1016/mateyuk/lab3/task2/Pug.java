package mirea.isbo1016.mateyuk.lab3.task2;

public class Pug extends Dog{
    public Pug() {

    }

    public Pug(int weight, boolean isMale) {
        super(weight, isMale);
    }

    @Override
    protected String getColor() {
       return "white";
    }

    @Override
    public String toString() {
        return "Pug{" +
                "weight=" + weight +
                ", color='" + getColor() + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
