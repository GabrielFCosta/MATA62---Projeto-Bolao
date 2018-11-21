
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
import java.util.List;
import model.vo.Administrador;
import static bolao.Executavel.lGerentes;

/**
 *
 * @author FABIO
 */
public class AdministradorDAO {
    private boolean test=false;
    private File file=new File("gerentes.json");
    public static void salvar(List<Administrador> lGerentes,String gerentes){
    
    Gson gson = new Gson();
  
    // converte objetos Java para JSON e retorna JSON como String
    String json = gson.toJson(lGerentes);
  
    try {
        //Escreve Json convertido em arquivo chamado "file.json"
        FileWriter writer = new FileWriter("gerentes.json");
        writer.write(json);
        writer.close();
  
    } catch (IOException e) {
        e.printStackTrace();
    }
  
    System.out.println(json);
    
    
    
    }
   
   public List<Administrador> ler(String gerentes) throws FileNotFoundException, IOException{
    test=file.exists();
    if(test!=true){
     System.out.println("Arquivo não existe");   
    }   
      
    else{   
       FileInputStream fstream = new FileInputStream("gerentes.json");
BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    
Gson gson = new Gson();   
Type gerenteType = new TypeToken<List<Administrador>>(){}.getType();
List<Administrador> gerente=gson.fromJson(br, gerenteType);
br.close();

for(Administrador g : gerente){   
    lGerentes.add(g);
    }
    }
return lGerentes;
}
 
}
