/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.dinhdang;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author ThanhTiem
 */
public class formatDate {
    public static void main(String[] args) {
        String patten = "dd/MM/yyy";
        String patten2 = "dd/MM/yyy hh:mm:ss a";
        String patten3 = "EEE, MMMM dd/MM/yyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patten3);
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patten3, new Locale("vi", "VN"));
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
