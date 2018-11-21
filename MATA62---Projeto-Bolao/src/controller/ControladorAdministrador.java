
package controller;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import bolao.Executavel;
import model.vo.Pessoa;
import model.vo.Apostador;
import model.vo.Administrador;
import views.ResultadoJogos;
import views.CadastrarApostador;
import views.FrmPrincipal;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import model.bo.AdministradorBO;
import model.dao.AdministradorDAO;
import model.vo.Aposta;
import static bolao.Executavel.lGerentes;

public class ControladorAdministrador {
   static Executavel executavel; 
    
   public static void gerar_Relatorio(){
   
   }
    
   public static void gerar_Relatorio_Funcionario(){
   
   }
   public static void inserir_Gestor(String nome,String senha, int matricula, String setor, String cargo){
      new AdministradorBO().inserir_Gestor(nome, senha, matricula, setor, cargo);      
      JOptionPane.showMessageDialog(null," Funcionário Cadastrado com Sucesso!","Sucesso",1);
    }
   public static void pesquisa_Gestor(int matricula){
        boolean cadastrado=false;
        for (int i=0; i< executavel.lGerentes.size();i++){
          if(executavel.lGerentes.get(i).getMatricula()==matricula){ 
           String gestor = executavel.lGerentes.get(i).getNome();
           CadastrarApostador.jCampoFunc.setText(gestor);
           cadastrado=true; 
          }
        }
        if(cadastrado==false)JOptionPane.showMessageDialog(null," Funcionário não cadastrado!","Atenção",1);
        
    }
   
   public static void excluir_Gestor(int matricula){
   new AdministradorBO().excluir_Gestor(matricula);
   JOptionPane.showMessageDialog(null," Funcionário Excluído com Sucesso!","Sucesso",1);  
   }  

    public static void backup_gerente() {
    new AdministradorDAO().salvar(lGerentes,"gerentes.json");
    }  
    public static void carregar_backup_ger() throws ClassNotFoundException, IOException{
        new AdministradorDAO().ler("gerentes.json");    
        
    }

}

