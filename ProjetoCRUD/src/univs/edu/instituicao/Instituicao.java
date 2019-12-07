package univs.edu.instituicao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

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
    
    @Column(length = 100, nullable = false)
    private boolean identidade;
    @Column(length = 100, nullable = false)
    private boolean carteira;
    @Column(length = 100, nullable = false)
    private boolean cpf;
    @Column(length = 100, nullable = false)
    private boolean titulo;
    
    @Transient
    public static Instituicao instituicao;
    
    @Transient
    public static Instituicao infoInstituicao;

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

    public boolean isIdentidade() {
        return identidade;
    }

    public void setIdentidade(boolean identidade) {
        this.identidade = identidade;
    }

    public boolean isCarteira() {
        return carteira;
    }

    public void setCarteira(boolean carteira) {
        this.carteira = carteira;
    }

    public boolean isCpf() {
        return cpf;
    }

    public void setCpf(boolean cpf) {
        this.cpf = cpf;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }
    
}
