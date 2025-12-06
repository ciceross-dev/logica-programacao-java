import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor01, valor02, prod;

        valor01 = sc.nextInt();
        valor02 = sc.nextInt();

        prod = valor01 * valor02;

        System.out.println("PROD = "+ prod);

        sc.close();

    }
}