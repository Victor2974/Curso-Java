package exercicios.ex012;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime dataPedido;
    private PedidoStatus status;

    private List<PedidoProduto> listaProdutos = new ArrayList<>();

    public Pedido(LocalDateTime dataPedido, PedidoStatus status) {
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "listaProdutos=" + listaProdutos +
                '}';
    }

    public List<PedidoProduto> getListaProdutos() {



        return listaProdutos;
    }

    public void adicionarProduto(PedidoProduto pedidoProduto){
        listaProdutos.add(pedidoProduto);
    }

    public void removerProduto(PedidoProduto pedidoProduto){
        listaProdutos.remove(pedidoProduto);
    }

    public Double total(){
        double soma = 0;
        for(PedidoProduto x: listaProdutos){
            soma += x.pedidoTotal();
        }return soma;
    }
}
