/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_nangcao;

/**
 *
 * @author ThanhTiem
 */
public class Java_nangcao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person p1 = new person(1, "A");
        person p2 = new person(1, "A");
        
        System.out.println("huhu:");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
    }
    
}
