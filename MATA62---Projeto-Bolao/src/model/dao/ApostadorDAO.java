/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.vo.Apostador;
import static bolao.Executavel.lFuncionarios;

/**
 *
 * @author FABIO
 */
public class ApostadorDAO {
    
    private boolean test=false;
    private File file=new File("funcionarios.json");
   
    public static void salvar(List<Apostador> lFuncionarios,String funcionarios){
    
    Gson gson = new Gson();
  
    // converte objetos Java para JSON e retorna JSON como String
    String json = gson.toJson(lFuncionarios);
  
    try {
        //Escreve Json convertido em arquivo chamado "file.json"
        FileWriter writer = new FileWriter("funcionarios.json");
        writer.write(json);
        writer.close();
  
    } catch (IOException e) {
        e.printStackTrace();
    }
  
    System.out.println(json);
    
    }
   
    public List<Apostador> ler(String funcionarios) throws FileNotFoundException, IOException{
    test=file.exists();
    if(test!=true){
     System.out.println("Arquivo não existe");   
    }   
      
    else{   
       FileInputStream fstream = new FileInputStream("funcionarios.json");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    
Gson gson = new Gson();   
Type funcionarioType = new TypeToken<List<Apostador>>(){}.getType();
List<Apostador> funcionario=gson.fromJson(br, funcionarioType);

br.close(); 
for(Apostador f : funcionario){   
lFuncionarios.add(f);
    
    }
}
return lFuncionarios;
}
}