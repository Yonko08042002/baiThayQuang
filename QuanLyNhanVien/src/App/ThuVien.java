/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import java.util.Scanner;

/**
 *
 * @author tuanta
 */
public class ThuVien {

    public static int getInt(String mes)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mes);
        return sc.nextInt();
    }
    public static double getDouble(String mes)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mes);
        return sc.nextDouble();
    }
    public static float getFloat(String mes)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mes);
        return sc.nextFloat();
    }
    public static String getString(String mes)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(mes);
        return sc.nextLine();
    }
}
