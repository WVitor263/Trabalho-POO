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
        } else {
            sessao.update(instituicao);
            JOptionPane.showMessageDialog(null, "Instituição Editada!");
        }
        transacao.commit();
        sessao.close();

    }
    
    public void excluir(Instituicao instituicao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(instituicao);
        transacao.commit();
        sessao.close();
    }

    public List<Instituicao> pesquisar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Instituicao> instituicoes = sessao.createCriteria(Instituicao.class).list();
        return instituicoes;
    }

   public Instituicao pesquisar(String email,String senha){
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Instituicao instituicao = (Instituicao) sessao.
                createCriteria(Instituicao.class).add(
                Restrictions.eq("email", email)).add(
                Restrictions.eq("senha",senha))
                .uniqueResult();
        return instituicao;      
    }
   
   public List<Instituicao> pesquisarPorCidade(String cidade) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Instituicao> instituicoes = sessao.createCriteria(Instituicao.class).add(
                Restrictions.eq("cidadeInstituicao", cidade)).list();
        return instituicoes;
        
    }
   
    public List<Instituicao> pesquisarPorNome(String nome) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Instituicao> instituicoes = sessao.createCriteria(Instituicao.class).add(
                Restrictions.eq("nomeInstituicao", nome)).list();
        return instituicoes;
        
    }
    
     public Instituicao pesquisar(String email) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Instituicao instituicao = (Instituicao) sessao.createCriteria(Instituicao.class).add(Restrictions.eq("email", email)).uniqueResult();
        sessao.close();
        return instituicao;

    }
}