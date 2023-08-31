package observer.entities;

import java.util.ArrayList;
import java.util.List;

public class Broadcaster implements Publisher {
    List<Subscriber> subscriberList;

    public Broadcaster() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    @Override
    public void publish(String message) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.consume(message);
        }
    }
}
