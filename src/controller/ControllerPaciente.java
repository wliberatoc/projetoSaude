/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoPaciente;
import funcoes.Validador;
import model.Paciente;

/**
 *
 * @author Willian
 */
public class ControllerPaciente {
    public void create(String nome, String nascimento,String cpf, String endereco, String telefone, 
                String sexo,float altura, float peso, String alergia,String doenca, String medicamento){
        Paciente pac = new Paciente();
        pac.setNome(nome);
        Validador v = new Validador();
        pac.setNascimento(v.manipuladorData(nascimento));
        pac.setCpf(cpf);
        pac.setEndereco(endereco);
        pac.setTelefone(telefone);
        pac.setSexo(sexo);
        pac.setAltura(altura);
        pac.setPeso(peso);
        pac.setAlergia(alergia);
        pac.setDoenca(doenca);
        pac.setMedicamento(medicamento);
        DaoPaciente d = new DaoPaciente();
        d.creat(pac);
    }

    
    
}
