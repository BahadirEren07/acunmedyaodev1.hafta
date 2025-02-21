import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        int derssayisi = 5;
        int toplamnot = 0;
        int enyuksek = 0;
        int endusuk = 100;
        int dusuknotsayisi = 0;


        for (int i = 1; i <= derssayisi; i++) {
            System.out.print(i + ". dersin notunu giriniz: ");
            int notu = scanner.nextInt();


            toplamnot += notu;


            if (notu > enyuksek) {
                enyuksek = notu;
            }
            if (notu < endusuk) {
                endusuk = notu;
            }


            if (notu < 30) {
                dusuknotsayisi++;
            }
        }


        double ortalama = toplamnot / (double) derssayisi;


        if (ortalama > 50) {
            System.out.println("Gectiniz");
        } else {
            System.out.println("Kaldınız");
        }


        if (dusuknotsayisi > 0) {
            System.out.println("Düşük not aldığınız " + dusuknotsayisi + " ders var!");
        }


        System.out.println("En yüksek not: " + enyuksek);
        System.out.println("En düşük not: " + endusuk);


        System.out.println("Ortalamanız: " + ortalama);

        scanner.close();
        }
    }
