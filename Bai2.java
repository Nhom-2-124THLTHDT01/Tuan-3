import java.util.Scanner;

public class Cau2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap diem trung binh : ");
        int dtb = scanner.nextInt();
        
        if(dtb>8.5){
            System.out.println("Gioi");
        }
        else if(dtb>6.5){
            System.out.println("Kha");
        }
        else if ( dtb>4.5) {
            System.out.println("Trung Binh");
        }
        else{
            System.out.println("Yeu");
        }
   } 
}
