public class FuncoesMath{
    public static void main(String[] args){

        double x = 3.0, y = 4.0, z = -5.0;
        double a, b, c;

        System.out.println("###Usando a Raiz Quadrada em Java-Math.sqrt!");

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(z);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n", x , a);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n", y , b);
        System.out.printf("Raiz quadrada de %.1f = %.2f%n", z , c);

        System.out.println("####Usando a Potênciação em Java-Math.pow!");

        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        System.out.printf("%.1f elevado a %.1f = %.2f%n", x, y, a);
        System.out.printf("%.1f elevado ao quadrado = %.2f%n", x, b);
        System.out.printf("5 elevado ao quadrado = %.2f%n", c);

        System.out.println("###Usando o valor Absoluto em Java-Math.abs!");

        a = Math.abs(y);
        b = Math.abs(z);
        System.out.printf("O valor absoluto de %.1f = %.2f%n", y, a);
        System.out.printf("O valor absoluto de %.1f = %.2f%n", z, b);
        

 





    }
    } 