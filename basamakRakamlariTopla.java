import java.util.Scanner;
public class basamakRakamlariTopla {
    public static void main(String[] args) {
        int a , total = 0 ;

        Scanner input = new Scanner (System.in);

        System.out.print("Sayı giriniz : ");
        a= input.nextInt();

        while (a != 0) {
            total += a%10;
            a = a / 10;
        }
        System.out.println("Basamak Değerleri Toplamı = " + total);
    }
}