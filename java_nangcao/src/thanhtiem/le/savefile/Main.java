/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.savefile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ThanhTiem
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p1 = new Person(1, "A");
        Person p2 = new Person(2, "B");
        File file = new File("Test.txt");
        
        if(!file.exists()){
            file.createNewFile();
        }
        
        FileOutputStream fileOut = new FileOutputStream(file);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        
        objectOut.writeObject(p1);
        fileOut.close();
        System.out.println("Save success!!");
        
        
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person p = (Person) objectInputStream.readObject();
        System.out.println(p.getId() +"_"+ p.getName());
    }
}
