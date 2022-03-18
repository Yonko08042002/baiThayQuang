/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tuanta
 */
public class ConnectonJDBC {
    public static Connection JDBCConnection() {
        final String Url = "jdbc:sqlserver://DESKTOP-VR1HT3E\\SQLEXPRESS:1433;databaseName=quanLyNhanSu";
        final String user = "sa";
        final String pass = "anhtuank56";
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(Url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    
    
    public void addEmppployee() throws SQLException {
        List<employee> listEmployee = new ArrayList();
        int n = ThuVien.getInt("Nhập số lượng người thêm vào hệ thống");
        for (int i = 0; i < n; i++) {
            listEmployee.add(new employee(ThuVien.getString("maNV") ,  ThuVien.getString("hoten") , ThuVien.getInt("heSoLuong")));        }
        for (employee empployee : listEmployee) {
            try {
                Connection connection = App.ConnectonJDBC.JDBCConnection();
                String sql = "insert into quanly (maNV, hoten,heSoLuong) values (?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, empployee.getMaNV());
                preparedStatement.setString(2, empployee.getTenNV());
                preparedStatement.setInt(3, empployee.getHeSL());
                int rs = preparedStatement.executeUpdate();
                System.out.println("Đã Thêm Thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void getAll() throws SQLException {
        NumberFormat df = new DecimalFormat("#,###");
        String sql = "select *, heSoLuong  * 14900000 as luong from quanly ";
        try {
            Connection connection = App.ConnectonJDBC.JDBCConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();;
            while (rs.next()) {
                System.out.print(rs.getString("maNV"));
                System.out.print(" - ");
                System.out.print(rs.getString("hoTen"));
                System.out.print(" - ");
                System.out.print(rs.getInt("hesoluong"));
                System.out.print(" - ");
                System.out.print(df.format(Double.parseDouble(rs.getString("heSoLuong"))*1490000) + "VNĐ");
            System.out.println(" ");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
     public employee getBymaNV(String maNV) throws SQLException {
        NumberFormat df = new DecimalFormat("#,###");
        String sql = "select *, heSoLuong  * 14900000 as luong from quanly where maNV = ? ";
        try {
            Connection connection = App.ConnectonJDBC.JDBCConnection();
            PreparedStatement stm;
            stm = connection.prepareStatement(sql);
            stm.setString(1, maNV);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                employee employee = new employee();
                System.out.print(rs.getString("maNV"));
                System.out.print(" - ");
                System.out.print(rs.getString("hoTen"));
                System.out.print(" - ");
                System.out.print(rs.getInt("hesoluong"));
                System.out.print(" - ");
                System.out.print(df.format(Double.parseDouble(rs.getString("heSoLuong"))*1490000) + "VNĐ");
            System.out.println(" ");
                return employee;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
     }
     
     public static void deleteDoUong(String mnv) {
        Connection connection = JDBCConnection();
        String sql = "delete from quanly where maNV = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,mnv);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
