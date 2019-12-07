package univs.edu.documentosDAO;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.documentos.TituloDeEleitor;
import univs.edu.util.HibernateUtil;

public class TituloDeEleitorDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(TituloDeEleitor titulo) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (titulo.getIdTitulo() == 0) {
            sessao.save(titulo);
            JOptionPane.showMessageDialog(null, "Titulo De Eleitor Cadastrado!");
        } else {
            sessao.update(titulo);
            JOptionPane.showMessageDialog(null, "Titulo De Eleitor Editado!");
        }
        transacao.commit();
        sessao.close();
    }

    public TituloDeEleitor pesquisar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        TituloDeEleitor titulo = (TituloDeEleitor) sessao.createCriteria(TituloDeEleitor.class).uniqueResult();
        return titulo;

    }
}
