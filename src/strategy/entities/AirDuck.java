package strategy.entities;

public class AirDuck implements FlyBehaviour {
    @Override
    public void fly(String direction) {
        System.out.println("Air duck is flying in "+direction+" direction");
    }
}
