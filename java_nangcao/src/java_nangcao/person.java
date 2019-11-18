/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_nangcao;

import com.sun.javafx.runtime.eula.Eula;

/**
 *
 * @author ThanhTiem
 */
public class person {
    private int id;
    private String name;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof person){
            person p2 = ((person) obj);
            if(p2.getId() == this.id){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
}
