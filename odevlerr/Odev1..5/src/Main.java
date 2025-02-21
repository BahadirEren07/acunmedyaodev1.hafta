//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int secimler;

        do {

            System.out.println("Menu");
            System.out.println("1 Makarna (250 TL)");
            System.out.println("2 Cizburger (275 TL)");
            System.out.println("3 Salata (150 TL)");
            System.out.println("4 Mercimek Corbasi (130 TL)");
            System.out.println("5 Odeme");
            System.out.print(" Yemek seciniz: ");

            secimler = scanner.nextInt();

            switch (secimler) {
                case 1:
                    toplamFiyat += 250;
                    System.out.println("Makarna siparişiniz alındı. Toplam: " + toplam );
                    break;
                case 2:
                    toplamFiyat += 275;
                    System.out.println("Cizburger siparişiniz alındı. Toplam: " + toplam );
                    break;
                case 3:
                    toplamFiyat += 150;
                    System.out.println("Salata siparişiniz alındı. Toplam: " + toplam);
                    break;
                case 4:
                    toplamFiyat += 130;
                    System.out.println("Mercimek Corbasi siparişiniz alındı. Toplam: " + toplam );
                    break;
                case 5:
                    System.out.println("Siparişiniz tamamlandı.");
                    System.out.println("Toplam odeme: " + toplam );
                    break;
                default:
                    System.out.println("Geçersiz seçim, tekrar deneyin.");
            }

        } while (secimler != 5);

        scanner.close();
    }
}
