package univs.edu.documentosDAO;

import univs.edu.documentos.CertidaoDeNascimento;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;

public class CertidaoDeNascimentoDAO {
    private Session sessao;
    private Transaction transacao;

    public void salvar(CertidaoDeNascimento certidao) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (certidao.getIdCertidao() == 0) {
            sessao.save(certidao);
            JOptionPane.showMessageDialog(null, "Certidão De Nascimento Cadastrada!");
        } else {
            sessao.update(certidao);
            JOptionPane.showMessageDialog(null, "Certidão De Nascimento Editada!");
        }
        transacao.commit();
        sessao.close();
    }
}
