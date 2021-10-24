package example;

import javax.xml.ws.Endpoint;

/**
 * @author Bryce_dd
 * @date 2021/10/24
 */
public class publish {
    public static void main(String[] args) {
        System.out.println("Server is starting...");
        ReaderService readerService = new ReaderService();
        Endpoint.publish("http://localhost:8080/readerService",readerService);
        System.out.println("Server is started...");
    }
}
