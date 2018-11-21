
package model.bo;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import static model.bo.ApostaBO.executavel;
import model.dao.JogoDAO;
import model.vo.Aposta;
import model.vo.Jogo;
import static bolao.Executavel.lApostas;


public class JogoBO {
    public void gerarRelatorio(Jogo relat) throws DocumentException, IOException{
    new JogoDAO().gerarRelatorio(relat);
        
    
    
    }
}