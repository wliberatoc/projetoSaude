/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAtendente;
import funcoes.Validador;
import model.Atendente;

/**
 *
 * @author Willian
 */
public class ContollerAtendente {
    public void create(String nome, String nascimento,String cpf, String endereco, String telefone, 
            String email, String senha){
        Atendente at = new Atendente();
        at.setNome(nome);
        Validador v = new Validador();
        at.setNascimento(v.manipuladorData(nascimento));
        at.setCpf(cpf);
        at.setEndereco(endereco);
        at.setTelefone(telefone);
        at.setEmail(email);
        at.setSenha(senha);
        DaoAtendente d = new DaoAtendente();
        d.create(at);
    }
}
