
package model.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.dao.ApostaDAO;
import model.vo.Aposta;
import bolao.Executavel;
import static bolao.Executavel.lApostas;
import java.util.Date;

/**
 *
 * @author FABIO
 */
public class ApostaBO {
    static Executavel executavel;
    
    public static void validar_Aposta(Date data, Date horario, int aposta, int jogo, String bolao, String timeA, String timeB ){
        if(executavel.lApostas.isEmpty()){        
        Aposta p = new Aposta(data, horario,aposta, jogo,bolao, timeA, timeB );
        p.setData(data);
        p.setHorario(horario);
        p.setAposta(aposta);
        p.setJogo(jogo);
        p.setBolao(bolao);
        p.setTimeA(timeA);
        p.setTimeB(timeB);
        executavel.lApostas.add(p);
        new ApostaDAO().salvar(lApostas,"registros.json");
        
        
       
    }


}
}