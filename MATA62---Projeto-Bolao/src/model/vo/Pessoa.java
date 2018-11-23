
package model.vo;

public abstract class Pessoa {
    
    protected String nome;
    protected int cpf ;
    protected String end;
    protected int telefone;
    protected String usuario;
    private String senha;
    
    public Pessoa() {
    	
    }
    
    public Pessoa(String usuario, String senha){
    	this.usuario = usuario;
    	this.senha = senha;    
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



    @Override
    public String toString() {
        return  "Nome: " + nome +"\n"+
                "CPF: " + cpf + "\n"+ 
                "Endereço: " + end + ", Tel: " + telefone +"\n";
    }

	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
    
    
       
    
}

