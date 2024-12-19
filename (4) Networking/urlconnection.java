import java.net.*;
import java.io.*;
import java.util.*;

public class urlconnection {
    public static void main(String args[]) {
        try {
            URL u = new URL("http://www.google.com/index.html");
            URLConnection uc = u.openConnection();

            System.out.println("Content-type: "+uc.getContentType());
            System.out.println("Content-length: "+uc.getContentLength());
            System.out.println("Last Modified: "+new Date(uc.getLastModified()));
            System.out.println("Date: "+new Date(uc.getDate()));
            System.out.println("Expiration: "+new Date(uc.getExpiration()));
            System.out.println("Content Encoding: "+uc.getContentEncoding());

        } catch (MalformedURLException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
    
}