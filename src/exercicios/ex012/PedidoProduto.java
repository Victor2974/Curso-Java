package exercicios.ex012;

public class PedidoProduto {
    private Integer quantidade;
    private Double preco;

    private Produto produto;

    public PedidoProduto(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double pedidoTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return produto.getNomeProduto()+", "+String.format("%.2f", preco)+", "+quantidade+", "+String.format("%.2f", pedidoTotal())+"\n";
    }
}
