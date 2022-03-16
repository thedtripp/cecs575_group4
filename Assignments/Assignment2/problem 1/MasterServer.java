//Package definitions

/*
*Singleton Class MasterServer
*/

//Java Libray definitions 
import java.util.ArrayList;

public class MasterServer{
	//MasterServer singleton instance
	private static MasterServer masterServer = new MasterServer();
	private MasterUserList userList;
	private ArrayList <PivateServer> serverList;
	
	
	private Master(){
		serverList = mew ArrayList<PrivateServer>();
	}
	
	public void generateUser(){
		
	}
	
	public void generatePrivateServer(Admin){
		
	}
	
	// userList getter and setter methods
	public setMasterUserList(MasterUserList userList){
		this.userlist=userlist;	
	}
	
	public MasterUserList getUserList(){
		return userList;
	}
	
	// serverList getter and setter methods
	public void setServerList(PrivateServer user){
		//setting logic 
		serverlist.add(user);	
	}
	
	public ArrayList <PrivateServer> getServerList(){
		return serverList;
	}
	
	//delete user from server list	
	public void delServerList (PrivateServer user){
		serverlist.remove(user);	
	}
	
	//MasterServer instance
	public static MasterServer getMasterServer(){
		return masterServer;
	}
}