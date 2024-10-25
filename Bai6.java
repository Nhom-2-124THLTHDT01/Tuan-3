import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số thứ nhất: ");
        double number1 = scanner.nextDouble();

        System.out.println("Nhập số thứ hai: ");
        double number2 = scanner.nextDouble();

        System.out.println("Chọn phép tính (nhập số): ");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Kết quả (Cộng): " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Kết quả (Trừ): " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Kết quả (Nhân): " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Kết quả (Chia): " + result);
                } else {
                    System.out.println("Lỗi: Không thể chia cho 0.");
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }

        scanner.close();
    }
}