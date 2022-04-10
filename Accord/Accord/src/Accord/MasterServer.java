package Accord;
/*
 * Server and Multi-Client tutorial 
 * https://gyawaliamit.medium.com/multi-client-chat-server-using-sockets-and-threads-in-java-2d0b64cad4a7
 * 
 */

//Java Library definitions 
import java.util.ArrayList;
import java.net.ServerSocket;
import java.net.Socket;


public class MasterServer{
	//MasterServer singleton instance
	private ArrayList <PrivateServer> serverList;
	
	
	private MasterServer(){
		serverList = new ArrayList<PrivateServer>();
	}
	
	public boolean generateUser(String loginName, String password){
		MasterUserList MUList = MasterUserList.getInstance();
		if(MUList.userIds.contains(loginName)) {
			return false;
		}
		
		User newUser = new User(loginName, password);
		return MUList.users.add(newUser);
	}
	
	public void generatePrivateServer(User Admin, String serverName){
		PrivateServer newServer = new PrivateServerBasic(serverName);
		serverList.add(newServer);
	}
	
	// serverList getter and setter methods
	public void addServerList(PrivateServer pServer){
		//setting logic 
		serverList.add(pServer);	
	}
	
	public ArrayList <PrivateServer> getServerList(){
		return serverList;
	}
	
	//delete privateServer from server list	
	public void delServerList (PrivateServer pServer){
		serverList.remove(pServer);	
	}
	
	
	
}
