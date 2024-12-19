import java.net.*;

public class url_class {
    public static void main(String[] args) throws MalformedURLException {
        
        /* Constructors:
         * URL(String urlSpecifier)
         * URL(String protocol, String hostName, int port, String path)
         * URL(String protocol, String hostName, String path)
         * URL(URL urlObj, String urlSpecifier)
         * 
        */
        
        //URL url = new URL("https://www.google.com/index.html");

        String protocol = "http";
        String hostName = "www.youtube.com";
        //int port = 80;
        String path = "/watch?v=dQw4w9WgXcQ";

        URL url = new URL(protocol, hostName, /*port,*/ path);

        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host: "+ url.getHost());
        System.out.println("Port: "+url.getPort());
        System.out.println("Default Port: "+url.getDefaultPort());
        System.out.println("Path: "+url.getPath());
        System.out.println("File: "+url.getFile());
        System.out.println("Authority: "+url.getAuthority());
        System.out.println("Query: "+url.getQuery());
        System.out.println("Ext: "+url.toExternalForm());

    }
}