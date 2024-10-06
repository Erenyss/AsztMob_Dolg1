//Lieszkofszki Norbert SZOFT I/2/N
//Feladat OOP 007

public class App{
    public static void main(String[] args) throws Exception {
       Network network = new Network();

       network.connectToNetwork("ThisNetwork");
       network.disconnectFromNetwork();
    }
}
