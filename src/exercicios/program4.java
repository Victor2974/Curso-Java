package exercicios;

import java.util.Scanner;
import java.util.Locale;


public class program4 {
   
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serao selecionadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for(int i = 0; i<n; i++){
            System.out.printf("%nAltura da %da pessoa: ",i+1);
            alturas[i] = sc.nextDouble();
            System.out.printf("%nGenero da %da pessoa: ",i+1);
            generos[i] = sc.next().charAt(0);
        }

        double maior = 0;
        double menor = 5;
        double somaAlturasMulheres = 0;
        int numeroMulheres = 0;
        int numeroHomens = 0;

         for(int i = 0; i<n; i++){
        
            //MAIOR E MENOR
            if(alturas[i] >= maior){
                maior = alturas[i];
            }
            if(alturas[i] <= menor){
                menor = alturas[i];
            }
           
            //CONTADOR DE HOMENS
            if(generos[i] == 'F'){
                numeroMulheres += 1;
            }

            //ALTURA DAS MULHERES
            if(generos[i] == 'F'){
                somaAlturasMulheres += alturas[i];
            }
            

            //CONTADOR DE HOMENS
            if(generos[i] == 'M'){
                numeroHomens += 1;
            }
        
        }

        sc.close();

        double mediaMulheres = somaAlturasMulheres/numeroMulheres;
    System.out.println("\nMenor altura = "+menor);
    System.out.println("Maior altura = "+maior);
    System.out.printf("Media das alturas das Mulheres = %.2f%n",mediaMulheres);
    System.out.println("Numero de homens = "+numeroHomens);


    }


    
}
