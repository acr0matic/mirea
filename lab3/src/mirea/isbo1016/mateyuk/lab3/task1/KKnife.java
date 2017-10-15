package mirea.isbo1016.mateyuk.lab3.task1;

public class KKnife extends Dish {
    public KKnife(boolean picturesOnDish, int weight) {
        super(picturesOnDish, weight);
    }

    public KKnife() {
    }

    @Override
    type getTypeOfDish() {
        return type.K_Knife;
    }

    @Override
    material getMaterialOfDish() {
        return material.Metal;
    }
}
