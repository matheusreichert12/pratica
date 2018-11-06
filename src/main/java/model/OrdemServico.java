package model;

import java.util.Date;

public class OrdemServico {

    private int id_os;
    private String descricao;
    private Date data_entrada;
    private Date data_saida;
    private Cliente id_cliente;
    private Vendas id_venda;

    public int getId_os() {
        return id_os;
    }

    public void setId_os(int id_os) {
        this.id_os = id_os;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Vendas getId_venda() {
        return id_venda;
    }

    public void setId_venda(Vendas id_venda) {
        this.id_venda = id_venda;
    }
}
