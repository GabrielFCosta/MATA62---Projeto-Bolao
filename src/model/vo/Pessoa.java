
package model.vo;

import java.io.Serializable;


public class Pessoa implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -7024227580155084017L;
	private String nome;
	private String cpf ;
	private String email;
	private String telefone;
	private String usuario;
    private String senha;
    private boolean adm;
    
    public Pessoa() {
    	
    }
    
    public Pessoa(String usuario, String senha){
    	this.usuario = usuario;
    	this.senha = senha;    
    }

    public Pessoa(String nome, String cpf, String email, String telefone, String usuario, boolean adm) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getUsuario() {
    	return usuario;
    }
    
    public void setUsuario(String usuario) {
    	this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}
	
   
}

