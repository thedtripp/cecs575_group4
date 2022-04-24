package Accord;

public class MessageSubscriber implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriber got notification with contents: " + m.getMessageContent());
    }
}