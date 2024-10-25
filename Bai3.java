import java.util.Scanner;
import java.util.Locale;

public class Bai3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap a la ");
        double a = scanner.nextDouble();
        System.out.print("nhap b la ");
        double b = scanner.nextDouble();
        System.out.print("nhap c la ");
        double c = scanner.nextDouble();

        System.out.println("Ta co phuong trinh bac 2 la " + a + "x^2 + " + b + "x + " + c);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Vay ta co x1= " + x1 + " va x2= " + x2);
        } else {
            if (delta == 0) {
                double x = (-b) / (2 * a);
                System.out.println("Vay x= " + x);
            } else {
                System.out.println("Vay phuong trinh vo nghiem");
            }
        }
        scanner.close();
    }
}
