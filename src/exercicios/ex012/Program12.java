package exercicios.ex012;

import exercicios.ex011.Senioridade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data nascimento (DD/MM/YYYY): ");
        DateTimeFormatter fmt1 =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringData = sc.nextLine();
        LocalDate dataNascimento = LocalDate.parse(stringData, fmt1);

        Cliente cliente = new Cliente(nome, email, dataNascimento);



        System.out.println("Processo do Pedido: ");
        System.out.print("Status: ");
        String entrada = sc.nextLine();
        PedidoStatus pedidoStatus = PedidoStatus.valueOf(entrada);
        System.out.print("Quantos produtos tem nesse pedido? ");
        int numerosPedido = sc.nextInt();
        sc.nextLine();
        LocalDateTime agora = LocalDateTime.now(ZoneOffset.ofHours(-3));

        Pedido pedido = new Pedido(agora,pedidoStatus);


        for(int i=0;i<numerosPedido;i++){

            System.out.printf("Insira #%d produto%n", i+1);
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            Produto produto = new Produto(nomeProduto,preco);

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();
            PedidoProduto pedidoProduto = new PedidoProduto(quantidade,preco,produto);

            pedido.adicionarProduto(pedidoProduto);
            System.out.println("");
        }

        System.out.println("Momento de pedido: "+pedido.getDataPedido());
        System.out.println("Status do pedido: "+pedido.getStatus());
        System.out.printf("Cliente: %s (%s) - %s%n", cliente.getNome(), cliente.getDataNascimento().format(fmt1), cliente.getEmail() );

        System.out.println("Produtos do Pedido: ");
        System.out.println(pedido.getListaProdutos());
        System.out.println("Total: "+pedido.total());



    }
}

