
package controller;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import model.bo.JogoBO;
import model.vo.Jogo;

/**
 *
 * @author FABIO
 */
public class ControladorAposta {
    public static void gerarRelatorio(int matricula, String nome, String cargo, String setor,String mes, int ano) throws DocumentException, IOException{ 
    Jogo relat = new Jogo(nome, matricula,cargo, setor, mes, ano);
    relat.setNome(nome);
    relat.setMatricula(matricula);
    relat.setCargo(cargo);
    relat.setSetor(setor);
    relat.setMes(mes);
    relat.setAno(ano);
    
    new JogoBO().gerarRelatorio(relat);
    
   }
}