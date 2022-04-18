package CECS575;

public class FlyweightServer {

	public String serverID;
    protected String serverName;
    protected String serverIcon;
    protected UserManager userManager;
    
    public FlyweightServer(String pServerID, String pServerName, String pServerIcon, UserManager pUserManager) {
    	serverID = pServerID;
    	serverName = pServerName;
    	serverIcon = pServerIcon;
    	userManager = pUserManager;
    }
}
