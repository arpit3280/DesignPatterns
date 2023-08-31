package observer;

import observer.entities.*;

public class ObserverMain {
    public void run(){
        Publisher publisher = new Broadcaster();
        Subscriber tv = new TvChannels(publisher);
        Subscriber radio = new Radio(publisher);
        publisher.publish("hello everyone. How Are You?");
    }
}
