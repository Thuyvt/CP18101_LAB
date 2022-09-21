/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class NDService {
    List<NguoiDung> listNguoiDung = new ArrayList<>();

    public NDService() {
        NguoiDung nd1 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "12345",
                2, true, "Giang Vien");
        NguoiDung nd2= new NguoiDung("loantt", "loantt@fpt.edu.vn", "12345",
                2, true, "Giang Vien");
        NguoiDung nd3 = new NguoiDung("thienth", "thienth@fpt.edu.vn", "12345",
                2, true, "Nhan Vien");
        NguoiDung nd4 = new NguoiDung("duyna", "duyna@fpt.edu.vn", "12345",
                1, true, "Sinh Vien");
        
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
    }
    
//    Lay ra danh sach nguoi dung
    public List<NguoiDung> getList() {
        return listNguoiDung;
    }
    
//    Them doi tuong moi vao service
    public void addNguoiDung(NguoiDung item) {
        listNguoiDung.add(item);
    }
    
}
