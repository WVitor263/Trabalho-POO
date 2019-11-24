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
            JOptionPane.showMessageDialog(null, "Instituição Cadastrado");
        }else {
            sessao.update(instituicao);
            JOptionPane.showMessageDialog(null, "Usuario Editado");
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
}
