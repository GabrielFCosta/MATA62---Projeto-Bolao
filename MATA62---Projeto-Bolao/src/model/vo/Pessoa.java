
package model.vo;

import java.io.Serializable;
import javax.management.timer.Timer;

public abstract class Pessoa {
    
    protected String nome;
    protected int cpf ;
    protected String end;
    protected int telefone;
    protected String usuario;
    
    
    public Pessoa(){
    
    }

    public Pessoa(String nome, int cpf, String end, int telefone, String usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
        this.telefone = telefone;
        this.usuario = usuario;
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

    public String getSenha() {
        return usuario;
    }

    public void setSenha(String senha) {
        this.usuario = senha;
    }



    @Override
    public String toString() {
        return  "Nome: " + nome +"\n"+
                "CPF: " + cpf + "\n"+ 
                "Endereço: " + end + ", Tel: " + telefone +"\n";
    }
    
    
       
    
}

