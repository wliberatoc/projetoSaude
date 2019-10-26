/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Willian
 */
public class Validador {
    public boolean validadorCPF(String cpf){
        Validador f = new Validador();
        if(cpf.length()!= 11)
            return false;
        if(f.verificaCpf(cpf) != 2)
            return false;
        return true;
    }//fim validador de cpf
    
    public boolean validadorTelefone(String telefone){
        int[] n  = new int [15];
        for(int i=0; i<(telefone.length()); i++){
            n[i] = telefone.charAt(i)-48;
            if(n[i]<0 || n[i]>9)
                return false;
        }
        return  telefone.length()== 11;
    }//fim validador de telefone
    
    public boolean validadorDataNascimento(String nascimento){
        int[] n = new int [9];
        for(int i=0; i<8; i++){
            n[i] = nascimento.charAt(i)-48;
            if(n[i]<0 || n[i]>9)
                return false;
        }
        String data = ""+n[0]+n[1];
        int dia     = Integer.parseInt(data);
        data        = "";
        data        = ""+n[2]+n[3];
        int mes     = Integer.parseInt(data);
        data        = "";
        data        = ""+n[4]+n[5]+n[6]+n[7];
        int ano     = Integer.parseInt(data);
        if(mes > 12)
            return false;
        if(ano < 1900)
            return false;
        if(dia > 30)
            return false;
        if(mes == 2 && dia > 29)
            return false;
        return true;
    }//fim validador de data de nascimento
   
    public boolean validadorEmail(String email){
        return(email.contains("@") );              
    }//fim validador de e-mail
    
    public boolean validadorSenha(String senha){
        return (senha.length() >= 6);
    }//fim validador de senha 
    
    public int verificaCpf(String cpf){
        int peso1 = 10;
        int peso2 = 11;
        int soma1 = 0;
        int soma2 = 0;
        int [] num = new int [11];
        int valit = 0;
        for(int i=0; i<11; i++){
            num[i] = cpf.charAt(i)-48;
            if(num[i]<0 || num[i]>9){
                return valit; 
            }
            if(i<9){
                soma1 += (num[i]*peso1);
                peso1--;
            }
            if(i<10){
                soma2 += (num[i]*peso2);
                peso2--;
            }
        }   
        int r1 = (soma1*10)%11;
        int r2 = (soma2*10)%11;
        if(r1 == 10)
            r1 = 0;
        if(r2 == 10)
            r2 = 0;
        if(r1 == num[9]){
            valit = 1;
        }
        if(r2 == num[10]){
            valit += 1;
        }
        return valit;
    }//verificador de cpf
    
    public boolean validadorPeso(String pe){
        try{
                 float p = Float.parseFloat(pe);
                 return true;
            }
            catch(NumberFormatException ex)
            {
                return false;   
            }
    }//fim  validador do peso
   
    public boolean validadorAltura(String al){
        try{
                 float a = Float.parseFloat(al);
                 return true;
            }
            catch(NumberFormatException ex)
            {
                return false;
                
            }        
    }//fim  validador do altura
    
    public String manipuladorData(String nascimento){
        int[] n     = new int [9];
        String data = "";
        for(int i=0; i<8; i++){
             n[i] = nascimento.charAt(i)-48;
        }
        for(int i=4; i<8; i++){
            data +=""+n[i];
        }
            data +=""+n[2];
            data +=""+n[3];
            data +=""+n[0];
            data +=""+n[1];
       return data;
       
    }// fim manipulador de data
    
}//fim da clase funções
