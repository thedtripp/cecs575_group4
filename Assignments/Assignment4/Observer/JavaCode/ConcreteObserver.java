package Accord;

public class ConcreteObserver implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber got notification with contents: " + m.getMessageContent());
    }
}