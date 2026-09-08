package exercicios.ex2;

import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numero = sc.nextInt();
        System.out.print("Enter account name: ");
        sc.nextLine(); // serve para limpar o "Enter"
        String nome = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);


        Conta conta;
        if (resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double saldo = sc.nextDouble();
            conta = new Conta(numero,nome,saldo);
        }else{
            conta = new Conta(numero,nome);
        }
        
    


        
        for(int escolha = 0; escolha!= 4;){
            System.out.println("\nAccount data: ");
            System.out.printf("Account %d, Holder: %s, Balance %.2f%n",conta.getNumero_conta(), conta.getTitular(), conta.getSaldo());

            double valor;
            System.out.println("1 - Depostit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Change name holder");
            System.out.println("4 - Exit");
            escolha = sc.nextInt();

            if(escolha == 1){
                System.out.print("\nEnter a deposit value: ");
                valor = sc.nextDouble();
                conta.deposito(valor);
            }else if(escolha == 2){
                System.out.print("\nEnter a withdraw value: ");
                valor = sc.nextDouble();
                conta.saque(valor);
            }else if (escolha == 3){
                System.out.print("\nEnter a new name: ");
                sc.nextLine();
                nome = sc.nextLine();
                conta.setTitular(nome);
            }


    

        }

        

        sc.close();
       
        

    }

}
