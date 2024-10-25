import java.util.Scanner;

public class Bai5 {
    public static boolean isRightTriangle(double a, double b, double c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba canh nay tao thanh tam giac.");

            if (a == b && b == c) {
                System.out.println("Day la tam giac deu.");
            }
            
            else if (a == b || b == c || a == c) {
                
                if (isRightTriangle(a, b, c)) {
                    System.out.println("Day la tam giac vuong can.");
                } else {
                    System.out.println("Day la tam giac can.");
                }
            }
            
            else if (isRightTriangle(a, b, c)) {
                System.out.println("Day la tam giac vuong.");
            }
            // Tam giác thường
            else {
                System.out.println("Day la tam giac thuong.");
            }
        } else {
            System.out.println("ba canh nay khong tao thanh tam giac.");
        }
        scanner.close();
    }
}

