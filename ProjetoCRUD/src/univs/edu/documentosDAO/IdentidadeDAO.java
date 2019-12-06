package univs.edu.documentosDAO;

import univs.edu.documentos.Identidade;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;

public class IdentidadeDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Identidade identidade) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (identidade.getIdIdentidade() == 0) {
            sessao.save(identidade);
            JOptionPane.showMessageDialog(null, "Identidade Cadastrada!");
        } else {
            sessao.update(identidade);
            JOptionPane.showMessageDialog(null, "Identidade Editada!");
        }
        transacao.commit();
        sessao.close();
    }
}
