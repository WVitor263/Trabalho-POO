package documento;

public class Documento {

    private String nome;
    private String periodoEmissao;
    private String prazoEntrega;
    private String docuNecessarios;
    private String idadeMinima;
    private String validade;
    private String obsevacoes;

    public String getPeriodoEmissao() {
        return periodoEmissao;
    }

    public void setPeriodoEmissao(String periodoEmissao) {
        this.periodoEmissao = periodoEmissao;
    }

    public String getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getDocuNecessarios() {
        return docuNecessarios;
    }

    public void setDocuNecessarios(String docuNecessarios) {
        this.docuNecessarios = docuNecessarios;
    }

    public String getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(String idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getObsevacoes() {
        return obsevacoes;
    }

    public void setObsevacoes(String obsevacoes) {
        this.obsevacoes = obsevacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
