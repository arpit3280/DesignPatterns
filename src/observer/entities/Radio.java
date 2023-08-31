package observer.entities;

public class Radio implements Subscriber{
    Publisher publisher;

    public Radio(Publisher publisher) {
        this.publisher = publisher;
        this.publisher.subscribe(this);
    }

    @Override
    public void consume(String message) {
        System.out.println("Radio message: " + message);
    }
}
