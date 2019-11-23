package univs.edu.instituicao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Instituicao {
  
    @Id
    @GeneratedValue
    private int idInstituicao;

    @Column(length = 100, nullable = false)
    private String nomeInstituicao;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String senha;

    @Column(length = 100, nullable = false)
    private String ruaInstituicao;

    @Column(length = 100, nullable = false)
    private String cidadeInstituicao;
    
    @Column(length = 100, nullable = false)
    private String telefone;
    

    public int getIdInstituicao() {
        return idInstituicao;
    }

    public void setIdInstituicao(int idInstituicao) {
        this.idInstituicao = idInstituicao;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRuaInstituicao() {
        return ruaInstituicao;
    }

    public void setRuaInstituicao(String ruaInstituicao) {
        this.ruaInstituicao = ruaInstituicao;
    }

    public String getCidadeInstituicao() {
        return cidadeInstituicao;
    }

    public void setCidadeInstituicao(String cidadeInstituicao) {
        this.cidadeInstituicao = cidadeInstituicao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
