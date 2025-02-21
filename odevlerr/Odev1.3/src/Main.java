import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen hızınızı giriniz (km/s): ");
        int hiz = scanner.nextInt();


        if (hiz > 130) {
            System.out.println("Ehliyetinize el konulmustur");
        } else if (hiz >= 110) {
            System.out.println("Cezanız 2000 TL");
        } else if (hiz >= 90) {
            System.out.println("Cezanız 1000 TL");
        } else {
            System.out.println("Hızınız sınırın altında.");
        }

        scanner.close();
    }
}