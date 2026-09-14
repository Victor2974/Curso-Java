package exercicios.ex11;

import java.sql.SQLType;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o departamento: ");
        Departamento departamento = new Departamento(sc.nextLine());
        System.out.println("\nDigite as informaçoes do Trabalhador: ");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Senioridade: ");
        String entrada = sc.nextLine();
        Senioridade senioridade = Senioridade.valueOf(entrada);


        System.out.print("Base salarial: ");
        double bs = sc.nextDouble();

        // CRIA O TRABALHADOR
        Trabalhador trabalhador = new Trabalhador(nome,senioridade,bs,departamento);

        // CONTRATOS
        System.out.print("Quantos contratos tem esse trabalhador? ");
        int quantidade = sc.nextInt();

        for(int i=0;i<quantidade;i++){

            sc.nextLine();
            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.printf("Digite contrato #%d",i+1);
            System.out.print("Date (DD/MM/YYYY): ");
            String dataTexto = sc.nextLine();

            LocalDate dataFormatada = LocalDate.parse(dataTexto,fmt1);
            System.out.print("Valor por hora: ");
            double valor = sc.nextDouble();
            System.out.print("Duracao(Horas): ");
            int horas = sc.nextInt();
            ContratoHora contratoHora = new ContratoHora(dataFormatada,valor,horas);
            trabalhador.addContrato(contratoHora);

        }

        sc.nextLine();
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        System.out.print("Digite o mes e o ano para calcular o rendimento (MM/YYYY): ");
        String mesEAnoTexto = sc.nextLine();
        YearMonth ym = YearMonth.parse(mesEAnoTexto, fmt2);
        System.out.println("Name: "+trabalhador.getNome());
        System.out.println("Departament: "+trabalhador.getDepartamento().getNomeDepartamento());
        System.out.printf("Rendimento de %d/%d: %.2f",ym.getMonthValue(),ym.getYear(), trabalhador.income(ym.getYear(), ym.getMonthValue()));
    }
}
