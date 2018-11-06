package model;

public class ItensOrdemServico {

    private OrdemServico id_os;
    private Servico id_servico;

    public OrdemServico getId_os() {
        return id_os;
    }

    public void setId_os(OrdemServico id_os) {
        this.id_os = id_os;
    }

    public Servico getId_servico() {
        return id_servico;
    }

    public void setId_servico(Servico id_servico) {
        this.id_servico = id_servico;
    }
}
