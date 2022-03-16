public abstract class PrivateServer implements Cloneable {

    protected String serverName;

    // protected UserManager userManager;
    // protected ChannelList channelList;

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