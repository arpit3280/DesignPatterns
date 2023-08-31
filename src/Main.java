import observer.ObserverMain;
import strategy.StrategyMain;

/*
This class will call each pattern main class.
 */
public class Main {
    public static void main(String[] args) {
        //strategy pattern
        System.out.println("-------------- Start Strategy Pattern -----------------");
        StrategyMain strategyMain = new StrategyMain();
        strategyMain.run();
        System.out.println("-------------- End Strategy Pattern -----------------");

        //observer pattern
        System.out.println("-------------- Start Observer Pattern -----------------");
        ObserverMain observerMain = new ObserverMain();
        observerMain.run();
        System.out.println("-------------- End Observer Pattern -----------------");

    }
}