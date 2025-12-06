
import java.util.Scanner;
import java.util.Locale;

public class ExeResolvido01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Entrada de dados
        System.out.print("Qual é a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Qual é o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.print("Qual é o valor do metro quadrado do terreno: R$ ");
        double valorM2 = sc.nextDouble();

        //Processamento dos dados
        double areaDoTerreno = largura * comprimento;
        double precoDoTerreno = valorM2 * areaDoTerreno;

        //Saída de dados
        System.out.println("Informações do seu Terreno");
        System.out.printf("Largura = %.2f%n", largura);
        System.out.printf("Comprimento = %.2f%n", comprimento);
        System.out.printf("Area Total = %.2f%n", areaDoTerreno);
        System.out.printf("Preço = R$ %.2f%n", precoDoTerreno);







    }

}
