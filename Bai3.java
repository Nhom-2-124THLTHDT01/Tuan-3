package bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap he so b: ");
        int b = sc.nextInt();
        System.out.print("Nhap he so c: ");
        int c = sc.nextInt();
        if (a == 0) {
            if (b != 0) {
                double x = (double) -c / b;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            int D = b * b - 4 * a * c;
            if (D == 0) {
                double x = (double) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else if (D > 0) {
                double x1 = (double) (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (double) (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}


