//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        double toplam = 0;
        String kupon="yuzde10";

        while (true) {
            System.out.println("Ürün seçin: ");
            System.out.println("1 - Su (10 TL)");
            System.out.println("2 - Sut Dilimi (20 TL)");
            System.out.println("3 - Kereviz (15 TL)");
            System.out.println("0 - Alışverişi tamamla");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplamFiyat += 10;
                    System.out.println("Su sepete eklendi. Toplam: " + toplam );
                    break;
                case 2:
                    toplamFiyat += 20;
                    System.out.println("Sut Dilimi sepete eklendi. Toplam: " + toplam );
                    break;
                case 3:
                    toplamFiyat += 15;
                    System.out.println("Kereviz sepete eklendi. Toplam: " + toplam );
                    break;
                case 0:
                    System.out.println("Alışveriş tamamlandı. Kuponunuz varsa giriniz)");
                    String kuponu = scanner.next();
                    if (kuponu.equals(kupon)) {
                        toplamFiyat *= 0.9;
                        System.out.println("İndirim uygulandı! Yeni toplam: " + toplam  );
                    }
                    System.out.println("Toplam ödemeniz: " + toplam );
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }


    }
}