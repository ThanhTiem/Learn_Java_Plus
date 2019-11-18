/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhtiem.le.interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ThanhTiem
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("f");
        list.add("u");
       
        
//        for (String s : list) {
//            if(s.equals("c")){
//                list.remove(s);
//                
//            }
//        }//lỗi vì do vòng lặp for-each: lúc đầu có 5 phần tử sau đó xóa 1 còn 4. sau khi xóa thì vị trí thứ 2 bị thiếu đi(tính từ 0)để cho chúng ta remove dẫn đến vòng lặp bị lỗi.
//        
        
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            if(next.equals("c")){
                itr.remove();
            }
        }
        for (String string : list) {
            System.out.println(string);
        }
     
    }
   
}
