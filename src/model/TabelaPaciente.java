/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willian
 */
public class TabelaPaciente extends AbstractTableModel{
    private List<Paciente> dados = new ArrayList<>();
    private String[] colunas     = {"Nome:","Nascimento:","Altura:","Peso:","CPF:","Alergias:","Doenças:","Medicamentos em uso:"};
    
    @Override
    public int getRowCount() {
        return dados.size();
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getNascimento();
            case 2:
                return dados.get(linha).getAltura();
            case 3:
                return dados.get(linha).getPeso();
            case 4:
                return dados.get(linha).getCpf();
            case 5:
                return dados.get(linha).getAlergia();
            case 6:
                return dados.get(linha).getDoenca();
            case 7:
                return dados.get(linha).getMedicamento();
        }
        return null;
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
