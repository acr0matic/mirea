package mirea.isbo1016.mateyuk.lab3.task2;

public class Pitbull extends Dog {

    public Pitbull() {
    }

    public Pitbull(int weight, boolean isMale) {
        super(weight, isMale);
    }

    @Override
    protected String getColor() {
        return  "Black";
    }

    @Override
    public String toString() {
        return "Pitbull{" +
                "weight=" + weight +
                ", color='" + getColor() + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
