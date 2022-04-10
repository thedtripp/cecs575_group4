package Accord;

public class PrivateServerAdvanced extends PrivateServer{
    
    public PrivateServerAdvanced(String privateServerName) {
        this.serverName = privateServerName;

        System.out.println(String.format("Advanced Private Server: %s created.", this.serverName));
    }
}