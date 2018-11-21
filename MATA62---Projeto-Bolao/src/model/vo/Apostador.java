
package model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.management.timer.Timer;


public class Apostador extends Pessoa implements Serializable {
    String Senha;

    public Apostador(String nome, String senha, int cpf, String end, int telefone, String usuario ) {
        super(nome, cpf, end, telefone, usuario);
        
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

  
       
    

   
    }

   

   
