package univs.edu.documento;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
    }