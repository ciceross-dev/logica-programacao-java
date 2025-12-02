public class ProcessaDados {
    public static void main(String[] args){
        System.out.println("Exemplo 01-Processamento simples");
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        System.out.println("Exemplo 02-Conversão explicita");

        double z;
        z = 2 * x;
        System.out.println(x);
        System.out.println(z);

        System.out.println("Exemplo 03-Calculando a area de um Trapezio");
        double baseMenor, baseMaior, altura, area;
        baseMenor = 6.0;
        baseMaior = 8.0;
        altura = 5.0;
        //Formular da area
        area = (baseMenor + baseMaior) / 2.0 * altura;
        System.out.println("A area do Trapezio é = "+ area);

        System.out.println("Exemplo 04.1-Sem o uso do Casting");
        int a = 5, b = 2;
        double resultado = a / b;
        System.out.println(resultado);

        System.out.println("Exemplo 04.2-Com o uso do Casting");
        int aa = 5, bb = 2;
        double resultado1 = (double) aa / bb;
        System.out.println(resultado1);

        System.out.println("Exemplo 05");
        double a1 = 5.0;
        int b1;
        b1 = (int)a1;
        System.out.println(b1);




    }
}
