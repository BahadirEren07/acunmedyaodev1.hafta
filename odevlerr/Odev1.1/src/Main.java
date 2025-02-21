import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sifre = 1234;
        int bakiye = 23000;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("SIFRENIZI GIRINIZ");
            int sifresi = scanner.nextInt();
            if (sifresi == sifre) {
                break;
            } else {
                System.out.println("Hatalı PIN! Tekrar deneyin.");
            }
        }

        while (true) {
            System.out.println("Bakiyeyi görüntülemek için 1'e basınız");
            System.out.println("Para yatırmak için 2'ye basınız");
            System.out.println("Para çekmek için 3'e basınız");
            System.out.println("Çıkış yapmak için 4'e basınız");
            System.out.println("Bir işlem seçin");
            int secim = scanner.nextInt();

            if (secim == 1) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (secim == 2) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz");
                int depozit = scanner.nextInt();
                bakiye += depozit;
                System.out.println("Yeni bakiyeniz: " + bakiye);
            } else if (secim == 3) {
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int tutar = scanner.nextInt();
                if (tutar > bakiye) {
                    System.out.println("Geçerli bir değer giriniz...");
                } else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            } else if (secim == 4) {
                System.out.println("Çıkış yapılıyor");
                break;
            } else {
                System.out.println("Geçerli bir değer giriniz");
            }
        }
        scanner.close();
    }
}
