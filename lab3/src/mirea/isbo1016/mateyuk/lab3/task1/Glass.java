package mirea.isbo1016.mateyuk.lab3.task1;

public class Glass extends Dish {
    public Glass(boolean picturesOnDish, int weight) {
        super(picturesOnDish, weight);
    }

    public Glass() {
    }

    @Override
    type getTypeOfDish() {
        return type.Glass;
    }

    @Override
    material getMaterialOfDish() {
        return material.Glass;
    }
}
