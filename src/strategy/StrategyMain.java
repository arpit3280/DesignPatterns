package strategy;

import strategy.entities.AirDuck;
import strategy.entities.PondDuck;

/*There are lots of ducks and each have their own fly behaviour.
Client will call fly and respective fly will run.
*/


/*
Strategy Pattern --> this contains family of algorithms. encapsulates it. and make them interchangeable and vary independently based on the clients.
 */
public class StrategyMain {

    public void run(){
        FlyDuck flyDuck = new FlyDuck(new AirDuck());
        flyDuck.fly("EAST");

        FlyDuck flyDuck2 = new FlyDuck(new PondDuck());
        flyDuck2.fly("WEST");
    }
}
