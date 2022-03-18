/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;
import Dao.employeeDao;
import Model.employee;
import java.sql.SQLException;

/**
 *
 * @author tuanta
 */
public class EmployeeService {

    private employeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new employeeDao();
    }

    public void getAllEmployee() throws SQLException {
        employeeDao.getAll();
    }
    
    public void  addEmployee()throws SQLException{
        employeeDao.addEmppployee();
    }
    
     public employee getEmployeeByMaNV(String Mnv) throws SQLException{
        return employeeDao.getBymaNV(Mnv);
    }
}
