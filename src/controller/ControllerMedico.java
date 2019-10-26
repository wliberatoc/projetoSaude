/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templmede file, choose Tools | Templmedes
 * and open the templmede in the editor.
 */
package controller;

import dao.DaoMedico;
import funcoes.Validador;
import model.Medico;
/**
 *
 * @author Willian
 */
public class ControllerMedico {
    public void create(String nome, String nascimento,String cpf, String endereco, String telefone,     
            String email, String senha,String crm){
        
        Medico med = new Medico();
        med.setNome(nome);
        Validador v = new Validador();
        med.setNascimento(v.manipuladorData(nascimento));
        med.setCpf(cpf);
        med.setEndereco(endereco);
        med.setTelefone(telefone);
        med.setEmail(email);
        med.setSenha(senha);
        med.setCrm(crm);
        DaoMedico d = new DaoMedico();
        d.create(med);
        
    }
}
