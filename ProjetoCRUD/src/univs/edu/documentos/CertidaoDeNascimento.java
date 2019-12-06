package univs.edu.documentos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CertidaoDeNascimento {
    @Id
    @GeneratedValue
    private int idCertidao;
    @Column(length = 100, nullable = false)
    private String documento = "Certidão De Nascimento";
    @Column(length = 100, nullable = false)
    private String periodoEmissao;
    @Column(length = 100, nullable = false)
    private String prazoEntrega;
    @Column(length = 100, nullable = false)
    private String docuNecessarios;
    @Column(length = 100, nullable = false)
    private String idadeMinima;
    @Column(length = 100, nullable = false)
    private String validade;

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdCertidao() {
        return idCertidao;
    }

    public void setIdCertidao(int idCertidao) {
        this.idCertidao = idCertidao;
    }
}