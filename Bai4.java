

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập vào ba số a, b, c từ bàn phím
        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhập số c: ");
        int c = scanner.nextInt();
        
        // Tìm số nhỏ nhất
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        
        // In ra số nhỏ nhất
        System.out.println("Số nhỏ nhất trong ba số là: " + min);
        
        scanner.close();
    }
}
