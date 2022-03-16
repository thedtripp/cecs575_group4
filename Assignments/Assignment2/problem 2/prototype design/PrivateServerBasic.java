public class PrivateServerBasic extends PrivateServer{
    
    public PrivateServerBasic(String privateServerName) {
        this.serverName = privateServerName;

        System.out.println(String.format("Basic Private Server: %s created.", this.serverName));
    }
}
