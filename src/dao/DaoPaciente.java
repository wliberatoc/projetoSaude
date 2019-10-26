/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionF;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Paciente;

/**
 *
 * @author Willian
 */
public class DaoPaciente {
    public void creat(Paciente p){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO `pacientes`(`cpf`, `nome`, `nascimento`, `sexo`, `altura`, `peso`, `endereco`, `alergias`, `doencas`, `medicamentos_usados`, `telefone`)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,p.getCpf());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getNascimento());
            stmt.setString(4,p.getSexo()); 
            stmt.setFloat(5,p.getAltura());
            stmt.setFloat(6,p.getPeso());
            stmt.setString(7,p.getEndereco());
            stmt.setString(8,p.getAlergia());
            stmt.setString(9, p.getDoenca());
            stmt.setString(10, p.getMedicamento());
            stmt.setString(11, p.getTelefone());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim create
    
    public void update(Paciente p){   
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("UPDATE `pacientes` SET `cpf` = ?, `nome` = ?, `nascimento` = ?, `sexo` = ?, `altura` = ?, `peso` = ?,"
                    +" `endereco` = ?, `alergias` = ?, `doencas` = ?, `medicamentos_usados` = ?, `telefone` = ?");
            stmt.setString(1,p.getCpf());
            stmt.setString(2,p.getNome());
            stmt.setString(3,p.getNascimento());
            stmt.setString(4,p.getSexo()); 
            stmt.setFloat(5,p.getAltura());
            stmt.setFloat(6,p.getPeso());
            stmt.setString(7,p.getEndereco());
            stmt.setString(8,p.getAlergia());
            stmt.setString(9, p.getDoenca());
            stmt.setString(10, p.getMedicamento());
            stmt.setString(11, p.getTelefone());
            
            stmt.setInt(12,p.getIdPaciente());
            
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim update
    
    public void delete(Paciente p){
        Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM `paciente` WHERE `idPaciente` = ?");
            
            stmt.setInt(0,p.getIdPaciente());
            stmt.execute();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso","Consultório",1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt);
        }
    }//fim delete
    
    public List<Paciente> pesquisa(String dado){
         Connection conn = ConnectionF.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Paciente> paciente = new ArrayList<>();
        try {
            stmt = conn.prepareStatement("SELECT * FROM `pacientes` WHERE cod_pac LIKE '%"+dado+"%' OR cpf "
                    + "LIKE '%"+dado+"%' OR nome LIKE '%"+dado+"%' OR nascimento LIKE '%"+dado+"%' OR endereco "
                    + "LIKE '%"+dado+"%' OR alergias LIKE '%"+dado+"%' OR doencas LIKE '%"+dado+"%' OR "
                    + "medicamentos_usados LIKE '%"+dado+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Paciente pac = new Paciente();
                pac.setNome(rs.getString("nome"));
                pac.setNascimento(rs.getString("nascimento"));
                pac.setAltura(rs.getFloat("altura"));
                pac.setPeso(rs.getFloat("peso"));
                pac.setAlergia(rs.getString("alergias"));
                pac.setDoenca(rs.getString("doencas"));
                pac.setMedicamento(rs.getString("medicamentos_usados"));
                pac.setEndereco(rs.getString("endereco"));
                
                paciente.add(pac);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na pesquisa = "+ex,"Consultório",0);
        }finally{
            ConnectionF.closeConnection(conn, stmt, rs);
        }
        return paciente;
    }//fim pesquisa
}
