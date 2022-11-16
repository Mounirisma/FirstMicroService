import org.example.ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:9191/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("server deployer");
    }
}
