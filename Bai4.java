/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu 1: ");
        int a = sc.nextInt();
        System.out.println("Nhap vao so thu 2: ");
        int b = sc.nextInt();
        System.out.println("Nhap vao so thu 3: ");
        int c = sc.nextInt();
        if(a>b)
            if(b>c)
                System.out.println("So nho nhat trong 3 so la: "+c);
            else
                System.out.println("So nho nhat trong 3 so la: "+b);
        else
            if(a>c)
                System.out.println("So nho nhat trong 3 so la: "+c);
            else
                System.out.println("So nho nhat trong 3 so la: "+a);
    }
    
}
