package Accord;

public interface MessageSubject 
{
    public void attach(Observer o);
    public void detach(Observer o);
    public void notifyUpdate(Message m);
}