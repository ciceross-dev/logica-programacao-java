import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nome = scanner.next();
        int idade = scanner.nextInt();
        double renda = scanner.nextDouble();
        char primeiraLetraNome = scanner.next().charAt(0);

        System.out.println("Dados digitados: ");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ renda);
        System.out.println("Letra Inicial do nome: "+primeiraLetraNome);

        scanner.close();
    }
}
