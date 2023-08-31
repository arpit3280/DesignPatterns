package observer.entities;

public class TvChannels implements Subscriber {
    Publisher publisher;

    public TvChannels(Publisher publisher) {
        this.publisher = publisher;
        publisher.subscribe(this);
    }

    @Override
    public void consume(String message) {
        System.out.println("tv channel message: " + message);
    }


}
