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
public class DinhDangTienTe {
    public static void main(String[] args) {
        double l = 123456789.89;
        Locale locale = new Locale("vi", "VN");
        NumberFormat number = NumberFormat.getCurrencyInstance(locale);
        number.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(number.format(l));
        
        DecimalFormat format2 = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        DecimalFormatSymbols formatSymbol2 = new DecimalFormatSymbols();
        formatSymbol2.setGroupingSeparator(',');
        formatSymbol2.setCurrencySymbol("VNĐ");
        format2.setDecimalFormatSymbols(formatSymbol2);
        
        System.out.println(format2.format(l));
        //-------------------------%------
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println(percentFormat.format(0.2));
    }
}
