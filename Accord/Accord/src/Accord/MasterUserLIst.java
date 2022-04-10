package Accord;

/*
*Singleton Class MasterUserList
*/

//Java Library definitions
import java.util.HashSet;
import java.util.Set;

public class MasterUserList {
	
	// Singleton MasterUserList knows about itself
	private static MasterUserList single_instance = null;
	
	// The userList stored within the singleton
	public Set<User> users;
	public Set<String> userIds;
	
	// private constructor allowing only the MasterUserList class to create itself
	private MasterUserList() {
		users = new HashSet<User>();
		userIds = new HashSet<String>();
	}
	
	// static method with lazy loading to provide a singleton instance to the requesting body
	public static MasterUserList getInstance() {
		//lazy loading
		if (single_instance == null)
            single_instance = new MasterUserList();
 
        return single_instance;
	}
	
}