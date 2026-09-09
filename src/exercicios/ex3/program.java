package exercicios.ex3;

import java.util.Scanner;
import java.util.Locale;

public class program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar? (Máximo - 10) ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < quantidade; i++ ){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < quantidade; i++ ){
             if (numeros[i]<0){
                System.out.println(numeros[i]);
            }

        }

           
        sc.close();
    }
    
}