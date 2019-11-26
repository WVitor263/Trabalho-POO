/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.instituicao;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.usuario.Usuario;
import univs.edu.util.HibernateUtil;

/**
 *
 * @author weliton
 */
public class InstituicaoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Instituicao instituicao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (instituicao.getIdInstituicao() == 0) {
            sessao.save(instituicao);
            JOptionPane.showMessageDialog(null, "Instituição Cadastrada!");
        }else {
            sessao.update(instituicao);
            JOptionPane.showMessageDialog(null, "Instituição Editada!");
        }
        transacao.commit();
        sessao.close();

    }
    
    public List<Instituicao> pesquisar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Instituicao> instituicoes = sessao.createCriteria(Instituicao.class).list();
        return instituicoes;
    }
    
    public String email(String email, String senha) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("email", email)).uniqueResult();
        sessao.close();
        if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
            return email;
        }
        return null;
    }

    public String senha(String senha, String email) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("senha", senha)).uniqueResult();
        sessao.close();
        if (usuario.getSenha().equals(senha) && usuario.getEmail().equals(email)) {
            return senha;
        }
        return null;
    }
}
