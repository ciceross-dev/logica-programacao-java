import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nome = sc.next();
        int idade = sc.nextInt();
        double renda = sc.nextDouble();
        char primeiraLetraNome = sc.next().charAt(0);

        System.out.println("Dados digitados: ");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Salário: "+ renda);
        System.out.println("Letra Inicial do nome: "+primeiraLetraNome);


        System.out.println("Fazendo a Leitura da linha inteira e resolvendo a quebra de linha pendente.");
        int numero;
        String texto1, texto2, texto3;

        numero = sc.nextInt();
        sc.nextLine();
        texto1 = sc.nextLine();
        texto2 = sc.nextLine();
        texto3 = sc.nextLine();

        System.out.println("Dados digitados: ");
        System.out.println(numero);
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);


        sc.close();
    }
}
