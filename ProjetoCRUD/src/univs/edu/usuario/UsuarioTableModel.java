package univs.edu.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Email", "Senha", "Cidade", " Rua", "N°"};

    public UsuarioTableModel(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getIdUsuario();
            case 1:
                return usuario.getNomeUsuario();
            case 2:
                return usuario.getEmail();
            case 3:
                return usuario.getSenha();
            case 4 :
                return usuario.getCidadeUsuario();
            case 5:
                return usuario.getRuaUsuario();
            case 6:
                return usuario.getNumeroUsuario();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
            case 3:
                return colunas[3];
             case 4:
                return colunas[4];
             case 5:
                return colunas[5];
             case 6:
                return colunas[6];




        }
        return null;
    }

}
