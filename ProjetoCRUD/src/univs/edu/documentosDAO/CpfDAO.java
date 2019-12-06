package univs.edu.documentosDAO;

import univs.edu.documentos.Cpf;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.util.HibernateUtil;

public class CpfDAO {
    private Session sessao;
    private Transaction transacao;

    public void salvar(Cpf cpf) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (cpf.getIdCpf() == 0) {
            sessao.save(cpf);
            JOptionPane.showMessageDialog(null, "CPF Cadastrado!");
        } else {
            sessao.update(cpf);
            JOptionPane.showMessageDialog(null, "Cpf Editado!");
        }
        transacao.commit();
        sessao.close();
    }
}
