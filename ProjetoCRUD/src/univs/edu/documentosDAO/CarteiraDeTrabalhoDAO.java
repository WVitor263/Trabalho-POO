package univs.edu.documentosDAO;

import univs.edu.documentos.CarteiraDeTrabalho;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import univs.edu.documentos.Cpf;
import univs.edu.util.HibernateUtil;


public class CarteiraDeTrabalhoDAO {
    private Session sessao;
    private Transaction transacao;

    public void salvar(CarteiraDeTrabalho carteira) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (carteira.getIdCarteira() == 0) {
            sessao.save(carteira);
            JOptionPane.showMessageDialog(null, "Carteira de Trabalho Cadastrada!");
        } else {
            sessao.update(carteira);
            JOptionPane.showMessageDialog(null, "Carteira de Trabalho Editada!");
        }
        transacao.commit();
        sessao.close();
    }
}
