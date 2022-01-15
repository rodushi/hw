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
public class FileClient {
    public static void main(String[] args)throws Exception {
        
        
        byte b[]= new byte[20002];
        Socket s1 = new Socket("localhost",4333);
        InputStream is = s1.getInputStream();
        FileOutputStream f = new FileOutputStream("E:\\new.o");
        is.read(b, 0, b.length);
        f.write(b, 0, b.length);
    }
    
}
