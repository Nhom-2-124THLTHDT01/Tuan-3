import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so : ");

        int a = scanner.nextInt();
        if( a>0 ){
            System.out.println("Day la so duong");
        }
        else if(a==0){
            System.out.println("Day la so 0");
        }
        else{
            System.out.println("Day la so am");
        }
    }
}