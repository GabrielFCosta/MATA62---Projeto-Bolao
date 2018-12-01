package model.bo;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import model.dao.JogoDAO;
import model.vo.Jogo;

public class JogoBO {

    public void gerarRelatorio(Jogo relat) throws DocumentException, IOException {
        new JogoDAO().gerarRelatorio(relat);

    }
}
