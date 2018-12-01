package controller;

import model.vo.Pessoa;
import model.dao.PessoaDAO;
import model.bo.PessoaBO;

public class ControlPessoa{
	
	private PessoaBO pessoas;
	private Pessoa PSaux;
	private PessoaDAO DAO;
	
	
    public ControlPessoa(){
    	DAO = new PessoaDAO();
    	
    }
    /**
     * Carrega Array de pessoas com conteúdo do arquivo pessoas.bin
     */
    public void carregaPessoas() {
        pessoas = DAO.loadPessoas();
    }

    /**
     * Grava arquivo pessoas.bin
     */
    public void gravaPessoas(){
        if(pessoas.getSize() > 0){
            DAO.salvaArquivo("pessoas.bin",pessoas);
        }
    }
    /**
     * Remove Pessoa do ArrayList.
     * @param nome de usuario da Pessoa
     */
    public boolean removePessoa(String usuario){
    	if(pessoas.checkPessoa(usuario)) {
    		PSaux = pessoas.getPessoa(usuario);
    		return pessoas.remove(PSaux);
    	}
    	else return false;
    }
    
    /**
     * Cadastro de pessoas.
     * @param nm nome
     * @param cp cpf
     * @param tl telefone
     * @param em e-mail
     * @param us usuario
     * @param sn senha
     * @param adm boolean
     * @return true se cadastrado
     */
    public boolean cadPessoa(String nm,String cp,String tl,String em,String us,String sn,boolean adm){
    	if(!pessoas.checkPessoa(us)) {
    		PSaux = new Pessoa();
    		PSaux.setNome(nm);
    		PSaux.setCpf(cp);
    		PSaux.setTelefone(tl);
    		PSaux.setEmail(em);
    		PSaux.setUsuario(us);
    		PSaux.setSenha(sn);
    		PSaux.setAdm(adm);
    		return pessoas.add(PSaux);
    	}
    	else return false;
    }
    
    public boolean checkPessoa(String usuario,String senha,boolean adm) {
    	if(pessoas.checkPessoa(usuario)) {
    		PSaux = pessoas.getPessoa(usuario);
    		if(PSaux.getSenha().equals(senha))
    			if(PSaux.isAdm() == adm)
    				return true;
    	}
    	return false;
    }
}