/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;
import java.sql.SQLException;
/**
 *
 * @author tuanta
 */
public class main {
    public static void main(String[] args) throws SQLException {
         ConnectonJDBC connectonJDBC = new ConnectonJDBC();              
        while (true) {
            System.out.println("");
            System.out.println("QUẢN LÝ NHÂN VIÊN");
            System.out.println("1. THÊM NHÂN VIÊN");
            System.out.println("2. HIỂN THỊ NHÂN VIÊN");
            System.out.println("3. HIỂN THỊ NHÂN VIÊN THEO MÃ NV");
            System.out.println("4. XÓA NHÂN VIÊN THEO MÃ NV");
            System.out.println("5. THOÁT !!!");
            int n = ThuVien.getInt("Mời chọn giá trị: ");
            switch (n) {
                case 1:
                    connectonJDBC.addEmppployee();
                    break;
                case 2:
                   connectonJDBC.getAll();
                    break;
                case 3:
                   String mnv = ThuVien.getString(" nhập mã nhân viên cần tìm !!!");
                   connectonJDBC.getBymaNV(mnv);
                    break;
                case 4: 
                    String mnvv = ThuVien.getString(" nhập mã sinh viên cần xóa !!!");
                    connectonJDBC.deleteDoUong(mnvv);
                    System.out.println("Bạn đã xóa thành công !!!");
            }
        }
    }
}
