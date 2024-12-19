import java.net.*;

class datagram_packet {
    public static void main(String args[]) {
        String s = "hello chat!";
        byte[] b = s.getBytes();

        try {
            
            InetAddress ia = InetAddress.getByName("localhost");
            int port=23;
            DatagramPacket dp = new DatagramPacket(b, b.length, ia, port);

            /* Constructors:
             * DatagramPacket(byte[] data, int length, InetAddress address, int port)
             * DatagramPacket(byte[] data, int offset, int length, InetAddress address, int port)
            */

            System.out.println("\nData sent to address: "+dp.getAddress());
            System.out.println("Port number: "+dp.getPort());
            System.out.println("Data length: "+dp.getLength());
            System.out.println("Offset: "+dp.getOffset());
            System.out.println("Socket Address: "+dp.getSocketAddress());
            System.out.println("\nData: "+new String(dp.getData()));

        } catch (UnknownHostException e) {
            System.err.println(e);
        }
        
    }
}