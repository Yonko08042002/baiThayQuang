/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author tuanta
 */
public class employee {
    private String maNV;
    private String tenNV;
    private int heSL;

    public employee(String maNV, String tenNV, int heSL) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.heSL = heSL;
    }

    public employee() {
    }


    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getHeSL() {
        return heSL;
    }

    public void setHeSL(int heSL) {
        this.heSL = heSL;
    }
}
