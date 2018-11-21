
package controller;

import views.ResultadoJogos;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import model.bo.ApostadorBO;
import model.dao.ApostadorDAO;
import model.vo.Apostador;
import bolao.Executavel;
import static bolao.Executavel.lApostadores;
public class ControladorApostador {
   static Executavel executavel;
    
    public static void inserir_Apostador(String nome, String senha,int cpf, String end, int telefone, String usuario){
    new ApostadorBO().inserir_Apostador(nome, senha, cpf, end,telefone, usuario);
     JOptionPane.showMessageDialog(null," Apostador Cadastrado com Sucesso!","Sucesso",1);
    }  
      public static void excluir_Apostador(int cpf ){  
     new ApostadorBO().excluir_Apostador(cpf);
     JOptionPane.showMessageDialog(null," Apostador Excluído com Sucesso!","Sucesso",1);
     }
    
    public static void pesquisa_Apostador(int cpf,String nome){
         boolean cadastrado=false;
        for (int i=0; i< executavel.lApostadores.size();i++){
          if(executavel.lApostadores.get(i).getCpf()==cpf){ 
           String apostador = executavel.lApostadores.get(i).getNome();
           ResultadoJogos.jCampoFunc.setText(apostador);
           cadastrado=true;  
          }
        }
       if(cadastrado==false)JOptionPane.showMessageDialog(null," Apostador não cadastrado!","Atenção",1);
    }  
    
    public static void backup_func() throws IOException{
    new ApostadorDAO().salvar(lApostadores,"Apostadores.json");
    } 
    
    public static void carregar_backup_func() throws ClassNotFoundException, IOException{
    new ApostadorDAO().ler("Apostadores.json");
    
    }
    
   
        
     
}
