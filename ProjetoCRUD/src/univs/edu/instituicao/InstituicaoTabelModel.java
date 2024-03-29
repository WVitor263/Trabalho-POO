package univs.edu.instituicao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class InstituicaoTabelModel extends AbstractTableModel {

    private List<Instituicao> instituicoes = new ArrayList<>();
    private String[] colunas = { "Nome", "Cidade", "Email"};
    

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
                return instituicao.getCidadeInstituicao();
            case 2:
                return instituicao.getEmail();
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
        }
        return null;
    }

}
