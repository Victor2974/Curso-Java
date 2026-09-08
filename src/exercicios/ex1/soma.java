package exercicios.ex1;


import java.util.Locale;
import java.util.Scanner;

public class soma {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        // Scanner sc = new Scanner(System.in); - sc.close()
        // sc.next() - String sem espaco
        // sc.nextInt() - Inteiros
        // sc.nextDouble() - Double - Locale.setDefault(Locale.US)
        // sc.next().charAt(0); - Char
        // Printf("%.4f",variavel); pra definir o numero de casas decimais 
      
        Scanner sc = new Scanner(System.in);
       
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = a*c /2;
        double circulo = c*c*3.14159;
        double trapezio = ((a+b)*c)/2;
        double quadrado = b*b;
        double retangulo = a*b;

        System.out.printf("Triangulo: %.3f%n Circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retangulo: %.3f%n"
         , triangulo, circulo, trapezio, quadrado, retangulo);
       

        sc.close();

    }
}
