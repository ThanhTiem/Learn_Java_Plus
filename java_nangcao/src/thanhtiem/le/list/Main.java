/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThanhTiem
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(3);
        Person p3 = new Person(2);
        Person p4 = new Person(5);
        Person p5 = new Person(4);
        Person p6 = new Person(6);
        
        List<Person> ListPerson = new ArrayList<Person>();
        ListPerson.add(p1);
        ListPerson.add(p6);
        ListPerson.add(p2);
        ListPerson.add(p1);
        ListPerson.add(p5);
        ListPerson.add(p4);
        ListPerson.add(p3);
        
        Person p =ListPerson.get(3);
        System.out.println(p.getID());
        ListPerson.forEach((person) -> {
            System.out.println(person.getID());
        });
    }
}
