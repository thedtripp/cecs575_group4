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
}