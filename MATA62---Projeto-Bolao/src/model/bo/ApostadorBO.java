
package model.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.dao.ApostadorDAO;
import model.vo.Apostador;
import bolao.Executavel;
import static bolao.Executavel.lApostadores;

/**
 *
 * @author FABIO
 */
public class ApostadorBO {
    static Executavel executavel;
    
 
    public static void inserir_Apostador(String nome, String senha,int cpf, String end, int telefone, String usuario){
      Apostador t = new Apostador(nome, senha, cpf, end, telefone, usuario);
      t.setNome(nome);
      t.setSenha(senha);
      t.setCpf(cpf);
      t.setEnd(end);
      t.setTelefone(telefone);
      t.setUsuario(usuario);
      executavel.lApostadores.add(t);
     
      
    } 
    
     public void excluir_Apostador(int cpf){
    
     
    for (int i=0; i< executavel.lApostadores.size();i++){
     if(executavel.lApostadores.get(i).getCpf()==cpf){ 
        executavel.lApostadores.remove(i);
        new ApostadorDAO().salvar(lApostadores,"Apostadores.json");
           
           
           }
        }
    }
        
}
