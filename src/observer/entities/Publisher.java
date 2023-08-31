package observer.entities;

public interface Publisher {
    public void subscribe(Subscriber subscriber);

    public void unsubscribe(Subscriber subscriber);

    public void publish(String message);
}
