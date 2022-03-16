/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accord;

import java.util.ArrayList;
public class Channel {  
    public class builder{
        private ArrayList<Message> MessageList;
        private String Name;
        private String Description;
        private boolean isPrivate;
        
        public void Server(String inputName){
            MessageList = new ArrayList<>();
            Name = inputName;
        }
    
        public ArrayList<String> getMessageList()
        {
            return MessageList;
        }
		
		public builder setMessageList(ArrayList<Message> messageList)
        {
            return builder;
        }
            
        public builder setName(String newName)
        {
            Name = newName;
            return this;
        }
    
        public String getName()
        {
            return Name;
        }
    
        public builder setDesc(String Desc)
        {
            Description = Desc;
            return this;
        }
    
        public String getDesc()
        {
            return Description;
        }
                
        public boolean getIsPrivate()
        {
            return isPrivate;
        }
    }
}
