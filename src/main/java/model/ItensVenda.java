package model;

public class ItensVenda {

    private Vendas id_venda;
    private Produto id_produto;
    private int quantidade;
    private float desconto;

    public Vendas getId_venda() {
        return id_venda;
    }

    public void setId_venda(Vendas id_venda) {
        this.id_venda = id_venda;
    }

    public Produto getId_produto() {
        return id_produto;
    }

    public void setId_produto(Produto id_produto) {
        this.id_produto = id_produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
