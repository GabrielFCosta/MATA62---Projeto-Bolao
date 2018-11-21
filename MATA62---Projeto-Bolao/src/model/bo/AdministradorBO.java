
package model.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.dao.AdministradorDAO;
import model.vo.Administrador;
import bolao.Executavel;
import static bolao.Executavel.lAdministradores;

/**
 *
 * @author FABIO
 */
public class AdministradorBO {
 static Executavel executavel;   
     public static void inserir_Gestor(String nome,String senha, int cpf, String end, int telefone, String usuario){
      Administrador a = new Administrador(nome, senha, cpf, end, telefone, usuario);
      a.setNome(nome);
      a.setSenha(senha);
      a.setCpf(cpf);
      a.setEnd(end);
      a.setTelefone(telefone);
      a.setUsuario(usuario);
      executavel.lAdministradores.add(a);
     
    }
   
   
   public static void excluir_Gestor(int cpf){
   
   for (int i=0; i< executavel.lAdministradores.size();i++){
     if(executavel.lAdministradores.get(i).getCpf()==cpf){ 
        executavel.lAdministradores.remove(i);
        new AdministradorDAO().salvar(lAdministradores,"Administradores.json");
   }  

   }
}
 
  
}
