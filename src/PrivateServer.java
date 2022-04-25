package CECS575;

import java.util.ArrayList;

public abstract class PrivateServer implements Cloneable {

	public String serverID;
    protected String serverName;
    protected String serverIcon;
    protected ArrayList<User> members;
    protected ArrayList<Channel> channelList;
    protected UserManager userManager;

    protected String generateInvite() {
        String inviteCode = String.format("https://accord.sh/invite/%s", this.serverName.replace(" ", "%20"));
        System.out.println(inviteCode);
        return inviteCode;
    };

    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    
    public Memento saveToMemento() {
    	return new Memento(members, channelList, userManager);
    }
    
    public void restoreFromMemento(Memento m) {
    	members = m.getMembers();
    	channelList = m.getChannels();
    	userManager = m.getUserManager();
    }
    
    public static class Memento {
    	
    	private final ArrayList<User> members;
    	private final ArrayList<Channel> channelList;
    	private final UserManager userManager;
    	
    	public Memento(ArrayList<User> mem, ArrayList<Channel> channels, UserManager userM) {
    		members = mem;
    		channelList = channels;
    		userManager = userM;
    	}
    	
    	public ArrayList<User> getMembers() {
    		return members;
    	}
    	
    	public ArrayList<Channel> getChannels() {
    		return channelList;
    	}
    	
    	public UserManager getUserManager() {
    		return userManager;
    	}
    	
    }
}