package univs.edu.instituicao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class InstituicaoTabelModel extends AbstractTableModel {

    private List<Instituicao> instituicoes = new ArrayList<>();
    private String[] colunas = { "Nome", "Email", "Senha", "Cidade", " Rua", "Telefone"};
    

    public InstituicaoTabelModel(List<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    @Override
    public int getRowCount() {
        return instituicoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Instituicao instituicao = instituicoes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return instituicao.getNomeInstituicao();
            case 1:
                return instituicao.getEmail();
            case 2:
                return instituicao.getSenha();
            case 3:
                return instituicao.getCidadeInstituicao();
            case 4:
                return instituicao.getRuaInstituicao();
            case 5:
                return instituicao.getTelefone();
        }
        return null;
    }

    @Override
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
            
        }
        return null;
    }

}
