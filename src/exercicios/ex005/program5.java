package exercicios.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class program5 {

    // Lista é uma interaface e não recebe variaveis primitivas
    // list.removeIf(x -> x.charAt(0) == 'M') - uma função lambda que remove todos que começam com M
    // list.indexOf() - Pra buscar o index especifico - retorna -1 se não achar ninguem
    
    // List<String> resultado = list.stream().filter(x -> x.charArt(0) == 'A').collect(Colectors.toList());
    // .findFirst().orElse(null);

    public static void main(String[] args) {
       
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);  
    List<Funcionario> list = new ArrayList<>();

    System.out.print("Quantos funcionarios vão ser registrados? ");
    int n = sc.nextInt();
    
    for(int i=0;i<n;i++){
        System.out.printf("\nFuncionario #%d%n",i+1);
        
        System.out.print("Id:");
        int id = sc.nextInt();

        System.out.print("Name:");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Salario:");
        Double salario = sc.nextDouble();

        list.add(new Funcionario(id, name, salario));

    }
    while (true) {
        System.out.print("Digite o ID do funcionario que vai receber um aumento: ");
        int idDigitado = sc.nextInt();

        boolean encontrado = false;

        for(Funcionario x: list){
            if(x.getId() == idDigitado){
                System.out.print("Digite a porcentagem do aumento: ");
                encontrado = true;
                double aumento = sc.nextDouble();
                x.aumento(aumento);
                break;
            }
        }
        if(!encontrado){
            System.out.println("ID não encontrado.");
            break;
        }
    }
        
    System.out.println("---------------------------");
        for(Funcionario x: list){
            System.out.print(x);
        }

    sc.close();

    }
}
