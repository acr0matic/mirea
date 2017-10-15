package mirea.isbo1016.mateyuk.lab3.task1;

public class Spoon extends Dish {


    public Spoon(boolean picturesOnDish, int weight) {
        super(picturesOnDish, weight);
    }

    public Spoon() {
    }

    @Override
    type getTypeOfDish() {
        return type.Spoon;
    }

    @Override
    material getMaterialOfDish() {
        return material.Metal;
    }


}
