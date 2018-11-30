
package model.vo;

public abstract class Pessoa {
    
    protected String nome;
    protected int cpf ;
    protected String email;
    protected int telefone;
    protected String usuario;
    private String senha;
    
    public Pessoa() {
    	
    }
    
    public Pessoa(String usuario, String senha){
    	this.usuario = usuario;
    	this.senha = senha;    
    }

    public Pessoa(String nome, int cpf, String email, int telefone, String usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
   
}

