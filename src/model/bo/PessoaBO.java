package model.bo;

import java.io.Serializable;
import java.util.ArrayList;

import model.vo.Pessoa;

public class PessoaBO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2022678953170344940L;
	private ArrayList<Pessoa> pessoas;

	public PessoaBO() {
        this.setPessoas(new ArrayList<Pessoa>());
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	public int getSize() {
		return this.pessoas.size();
	}
	
	public boolean add(Pessoa ps){
		 return pessoas.add(ps);
    }
	
	public boolean remove(Pessoa ps){
		 return pessoas.remove(ps);
    }

	public Pessoa getPessoa(String usuario) {
		for(Pessoa obj : this.pessoas){
			if(obj.getUsuario().equalsIgnoreCase(usuario)){
				return obj;
			}
	    }
		return null;
	}
	
	public boolean checkPessoa(String usuario){
		for(Pessoa obj : this.pessoas){
			if(obj.getUsuario().equalsIgnoreCase(usuario)){
				return true;
            }
        }
        return false;
    }

}
