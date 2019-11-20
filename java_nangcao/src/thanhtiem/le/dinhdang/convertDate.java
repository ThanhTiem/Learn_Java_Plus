/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.dinhdang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ThanhTiem
 */
public class convertDate {
    public static void main(String[] args) {
        String DateStr = "20/10/2019 4:20 PM";
        String patten = "dd/MM/yyy hh:mm a";
        SimpleDateFormat dateFormat = new SimpleDateFormat(patten);
        try {
            Date date =dateFormat.parse(DateStr);
            System.out.println(date);
        } catch (ParseException ex) {
            Logger.getLogger(convertDate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
