/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.dinhdang;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author ThanhTiem
 */
public class Format_Number {
    public static void main(String[] args) {
        long l = 123456789;
        double k = 1234567.890123;
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getInstance(locale);
        format.setMaximumFractionDigits(1);
        format.setMinimumFractionDigits(0);
        format.setMaximumIntegerDigits(2);
        format.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(format.format(l));
        System.out.println(format.format(k));
        //---------------------
        String patten = "###,###.##";
        //DecimalFormat decimalformat = new DecimalFormat(patten);
        DecimalFormat decimalformat = (DecimalFormat) DecimalFormat.getInstance(locale);
        //decimalformat.setMaximumFractionDigits(4);
        DecimalFormatSymbols formatSybol = new DecimalFormatSymbols();
        formatSybol.setGroupingSeparator(' ');
        formatSybol.setDecimalSeparator(',');
        decimalformat.setDecimalFormatSymbols(formatSybol);
        decimalformat.setGroupingSize(4);
        

        
        System.out.println(decimalformat.format(l));
        System.out.println(decimalformat.format(k));
        
    }
}
