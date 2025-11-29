//importando as classes.
import java.util.Locale;
public class SaidaDeDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        //Para escrever um texto na tela com e sem quebra de linhas

        System.out.println("Bom dia!");
        System.out.print("Bom dia!   ");
        System.out.print("Bom dia!");

        System.out.println();
        //Para escrever uma variável
        int y = 32;
        double x = 10.6242;
        double v = 5.41787;
        System.out.println(y);

        //Para escrever uma variável com ponto flutuante
        System.out.println(x);
        System.out.printf("%.2f%n", x);

        //conatena varios elementos 01
        System.out.println("Resultado = " + x + " Metros");

        //conatena varios elementos 02
        System.out.printf("Resultado = %.2f metros%n", v);
        //conatena varios elementos com marcadores
        String nome = "Maria";
        int idade = 31;
        double renda = 4582.6235;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}
