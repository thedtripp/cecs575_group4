package Accord;

public class TestPrivateServer {
    public static void main(String args[]) {

        PrivateServer pb = new PrivateServerBasic("Cool Basic Server");
        PrivateServer pa = new PrivateServerAdvanced("Dope Advanced Server");
        // System.out.println(pb.generateInvite());
        // System.out.println(pa.generateInvite());
        pb.generateInvite();
        pa.generateInvite();
    }
}
