/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionsDemo {

    public static void main(String[] args) {
        // LIST Luu tru phan tu theo thu tu them vao, cho phep cac phan tu co gia tri trung lap
        List<Double> listDouble = new ArrayList<>();
        listDouble.add(12.5);
        listDouble.add(17.5);
        listDouble.add(20.5);
        listDouble.add(15.5);
        listDouble.add(12.5);
        System.out.println("List double: " + listDouble);
        // SET khong cho phep luu tru phan tu co gia tri trung lap
        Set<Double> setDouble = new HashSet<>();
        setDouble.add(12.5);
        setDouble.add(17.5);
        setDouble.add(20.5);
        setDouble.add(15.5);
        setDouble.add(12.5);
        System.out.println("Set double: " + setDouble);
        // TreeSet sap xep phan tu theo gia tri
        Set<Double> treeSetDouble = new TreeSet<>();
        treeSetDouble.add(12.5);
        treeSetDouble.add(17.5);
        treeSetDouble.add(20.5);
        treeSetDouble.add(15.5);
        treeSetDouble.add(12.5);
        System.out.println("Tree set double: " + treeSetDouble);

        // size(), add(), remove()
        // List: set(index, giatri), get(index)
        List<NguoiDung> listNguoiDung = new ArrayList<>();

        NguoiDung nd1 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "12345",
                2, true, "Giang Vien");
        NguoiDung nd2 = new NguoiDung("loantt", "loantt@fpt.edu.vn", "12345",
                2, true, "Giang Vien");
        NguoiDung nd3 = new NguoiDung("thienth", "thienth@fpt.edu.vn", "12345",
                2, true, "Nhan Vien");
        NguoiDung nd4 = new NguoiDung("duyna", "duyna@fpt.edu.vn", "12345",
                1, true, "Sinh Vien");
        NguoiDung nd5 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "12345",
                2, true, "Giang Vien");

        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);
        
        // Xoa doi tuong dua vao index
//        listNguoiDung.remove(4);
        NguoiDung removeItem = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn", "12345",
                2, true, "Giang Vien");
//        System.out.println(nd1.hashCode());
//        System.out.println(nd5.hashCode());
//        System.out.println(removeItem.hashCode());
        // Remove chi xoa phan tu dau tien
//        listNguoiDung.remove(removeItem);
        // Xoa toan bo doi tuong co gia tri = removeItem
        // C1: listNguoiDung.removeIf(item -> Objects.equals(removeItem, item));
        // C2:  while(listNguoiDung.remove(removeItem));
        // C3: dung RemoveAll
        List<NguoiDung> listRemove = new ArrayList<>();
        listRemove.add(removeItem);
        listNguoiDung.removeAll(listRemove);
        
        for (NguoiDung item : listNguoiDung) {
            System.out.println("Tk: " + item.getUserName() + " - email: " + item.getEmail());
        }

    }
}
