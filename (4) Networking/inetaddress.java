import java.net.*;

class inetaddress {
    public static void main(String args[]) throws UnknownHostException {

        // Factory methods defined in InetAddress class

        InetAddress a1 = InetAddress.getLocalHost();
        
        System.out.println("Local Host Address: "+a1);

        InetAddress a2 = InetAddress.getByName("www.google.com");
        System.out.println("\nGoogle Host Address: "+a2);

        InetAddress[] a3 = InetAddress.getAllByName("www.cloudflare.com");
        System.out.println("\nCloudflare Host Addresses: ");
        for(int i=0; i<a3.length; i++) {
            System.out.println(a3[i]);
        }

        byte[] ipAddress = {(byte)142, (byte)250, 70, 100}; 
        InetAddress a4 = InetAddress.getByAddress(ipAddress);
        
        System.out.println("\nHost name: "+a4);

        // Instance Methods of InetAddress class
        
        System.out.println("\n------ Instance Methods -------");
        System.out.println("Is a2 equal to a4? : "+a2.equals(a4));
        System.out.println("Host Address: "+ a1.getHostAddress());
        System.out.println("Host Name: "+a1.getHostName());
        System.out.println("toString: "+a1.toString());
        System.out.println("Is it Multicast Address: "+a1.isMulticastAddress());

    }
}