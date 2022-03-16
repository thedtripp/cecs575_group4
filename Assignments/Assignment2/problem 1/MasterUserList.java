//Package definitions
package CECS575;

/*
*Singleton Class MasterUserList
*/

//Java Library definitions
import java.util.ArrayList;

public class MasterUserList {
	
	// Singleton MasterUserList knows about itself
	private static MasterUserList single_instance = null;
	
	// The userList stored within the singleton
	public ArrayList<User> users;
	
	// private constructor allowing only the MasterUserList class to create itself
	private MasterUserList() {
		users = new ArrayList<User>();
	}
	
	// static method with lazy loading to provide a singleton instance to the requesting body
	public static MasterUserList getInstance() {
		//lazy loading
		if (single_instance == null)
            single_instance = new MasterUserList();
 
        return single_instance;
	}
	
}
