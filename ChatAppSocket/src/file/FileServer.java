/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.*;
import java.net.*;
/**
 *
 * @author User
 */
public class FileServer {
    
    public static void main(String[] args)throws Exception {
        ServerSocket s = new ServerSocket(4333);
        Socket s1= s.accept();
        FileInputStream f= new FileInputStream("C:\\Users\\User\\Documents\\1.o");
    byte b[]= new byte[20002];
    f.read(b, 0, b.length);
    OutputStream os = s1.getOutputStream();
    os.write(b, 0, b.length);
}
}