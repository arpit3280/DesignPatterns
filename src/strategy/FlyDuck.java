package strategy;

import strategy.entities.FlyBehaviour;

public class FlyDuck {
    private final FlyBehaviour flyBehaviour;


    public FlyDuck(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly(String direction){
        flyBehaviour.fly(direction);
    }
}
