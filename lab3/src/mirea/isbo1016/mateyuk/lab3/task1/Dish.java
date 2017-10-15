package mirea.isbo1016.mateyuk.lab3.task1;

public abstract class  Dish {

    protected enum material {
        Metal,Wood,Clay,Glass
    };

    protected enum type {
        K_Knife, Fork, Plate, Glass, Spoon
    };


    protected boolean picturesOnDish;
    protected int weight;


    abstract type getTypeOfDish();
    abstract material getMaterialOfDish();

    public Dish(boolean picturesOnDish, int weight) {
        this.picturesOnDish = picturesOnDish;
        this.weight = weight;
    }

    public Dish() {
    }

    public boolean isPicturesOnDish() {
        return picturesOnDish;
    }

    public void setPicturesOnDish(boolean picturesOnDish) {
        this.picturesOnDish = picturesOnDish;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Kitchen Knife {" +
                "picturesOnDish = " + picturesOnDish +
                ", weight = " + weight + ", material = " + getMaterialOfDish() + ", type = "
                + getTypeOfDish() + '}';
    }
}
