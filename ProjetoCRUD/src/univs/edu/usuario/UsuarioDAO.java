package univs.edu.usuario;

import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import univs.edu.util.HibernateUtil;

public class UsuarioDAO {

    private Session sessao;
    private Transaction transacao;

    public void salvar(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        if (usuario.getIdUsuario() == 0) {
            sessao.save(usuario);
            JOptionPane.showMessageDialog(null, "Cadastrado Concluído!");
        } else {
            sessao.update(usuario);
            JOptionPane.showMessageDialog(null, "Editado com Sucesso!");
        }
        transacao.commit();
        sessao.close();
    }

    public void excluir(Usuario usuario) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        sessao.delete(usuario);
        transacao.commit();
        sessao.close();
    }

    public Usuario pesquisar(int id) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("idUsuario", id)).uniqueResult();
        sessao.close();
        return usuario;

    }

    public Usuario pesquisar(String email, String senha) {
        sessao = HibernateUtil.
                getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.
                createCriteria(Usuario.class).add(
                Restrictions.eq("email", email)).add(
                Restrictions.eq("senha", senha))
                .uniqueResult();
        return usuario;
    }

    public List<Usuario> pesquisar() {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
        return usuarios;

    }

    public Usuario pesquisar(String email) {
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        Usuario usuario = (Usuario) sessao.createCriteria(Usuario.class).add(Restrictions.eq("email", email)).uniqueResult();
        sessao.close();
        return usuario;

    }

}
