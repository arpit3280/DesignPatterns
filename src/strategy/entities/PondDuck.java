package strategy.entities;

public class PondDuck implements FlyBehaviour{
    @Override
    public void fly(String direction) {
        System.out.println("Pond duck cannot fly");
    }
}
