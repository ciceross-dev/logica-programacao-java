import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
        double a, b, c, media;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        media = (a * 2 + b * 3 + c * 5) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
    }
}