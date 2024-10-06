public class Network implements I_Connect {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connected to Network " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Disconnected");
    }
    
}
