package CECS575;

import java.util.HashMap;

public class FlyweightFactory {
	
	private static HashMap<String, FlyweightServer> cache = new HashMap<String, FlyweightServer>();
	
	public static FlyweightServer isCached(String serverID) {
		return cache.get(serverID);
	}
	
	public static FlyweightServer getFlyweightServer(String serverID, String serverName, String serverIcon, UserManager serverUM) {
		FlyweightServer flyServer = isCached(serverID);
		if(flyServer == null) {
			flyServer = new FlyweightServer(serverID, serverName, serverIcon, serverUM);
			cache.put(serverID, flyServer);
		}
		
		return flyServer;
	}
	
}
