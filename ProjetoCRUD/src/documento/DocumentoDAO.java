package documento;

import univs.edu.usuario.*;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

public class DocumentoDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Documento documento) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (documento.getIdDocumentos() == 0) {
            sessao.save(documento);
            JOptionPane.showMessageDialog(null, "Documento Cadastrado");
        } else {
            sessao.update(documento);
            JOptionPane.showMessageDialog(null, "Documento Editado");
        }
        transacao.commit();
        sessao.close();
    }

    public void excluir(Documento documento) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(documento);
        transacao.commit();
        sessao.close();
    }

    public Documento pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Documento documento= (Documento) sessao.createCriteria(Usuario.class).add(Restrictions.eq("idDocumentos", id)).uniqueResult();
        sessao.close();
        return documento;

    }
   

    public List<Documento> pesquisar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Documento> documento = sessao.createCriteria(Documento.class).list();
        return documento;

    }
   
    }
    

