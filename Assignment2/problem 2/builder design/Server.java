/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accord;

import java.util.ArrayList;
public class Server {  
    public class builder{
        private ArrayList<String> UserList;
        private ArrayList<Channel> ChannelList;
        private int capacity;
        private String Name;
        private String Description;
        private boolean isPrivate;
        private String InviteCode;
    
        public void Server(String inputServerName){
            UserList = new ArrayList<>();
            ChannelList = new ArrayList<>();
            Name = inputServerName;
        }
    
        public void buildUserList(ArrayList<String> Users){
            UserList = new ArrayList<>(Users);
        }
    
        public ArrayList<String> getUserList()
        {
            return UserList;
        }
    
        public ArrayList<Channel> getChannelList()
        {
            return ChannelList;
        }
        
        public builder setServerName(String newName)
        {
            Name = newName;
            return this;
        }
    
        public String getServerName()
        {
            return Name;
        }
    
        public builder setServerDesc(String Desc)
        {
            Description = Desc;
            return this;
        }
    
        public String getServerDesc()
        {
            return Description;
        }
        
        public String getInviteCode()
        {
            return InviteCode;
        }
        
        public builder generateInvitecode()
        {
            //Eventually add invite code generation here.
            return this;
        }
        
        public String getInvitecode()
        {
            //Eventually add invite code generation here.
            return InviteCode;
        }
        
        public builder setCapacity(int cap)
        {
            capacity = cap;
            return this;
        }
        
        public int getCapacity()
        {
            return capacity;
        }
        
        public boolean getIsPrivate()
        {
            return isPrivate;
        }
    }
}
