/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ThanhTiem
 */
public class Main_comparable {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "Tiem"));
        list.add(new Person(3, "Nam"));
        list.add(new Person(2, "Hoa"));
        list.add(new Person(6, "Lan"));
        list.add(new Person(4, "TUNG"));
        list.add(new Person(5, "Tuan"));
        System.out.println("Before sort ID:");
        for (Person person : list) {
            System.out.println(person.getId() + person.getName());
        }
        System.out.println("after sort ID:");
        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person.getId() + person.getName());
        }
    }
}
