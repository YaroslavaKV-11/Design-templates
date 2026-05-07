public class Client {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber firstSubscriber = new Subscriber("First subscriber");
        Subscriber secondSubscriber = new Subscriber("Second subscriber");
        Subscriber thirdSubscriber = new Subscriber("Third subscriber");

        publisher.attach(firstSubscriber);
        publisher.attach(secondSubscriber);

        publisher.setMessage("First message");

        publisher.attach(thirdSubscriber);

        publisher.setMessage("Second message");

        publisher.detach(secondSubscriber);

        publisher.setMessage("Third message");
    }
}