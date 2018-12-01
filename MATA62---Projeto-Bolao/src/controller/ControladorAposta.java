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

    public static void gerarRelatorio(int id, String timeA, String timeB, int placarTimeA, int placarTimeB) throws DocumentException, IOException {
        Jogo relat = new Jogo(id, timeA, timeB, placarTimeA, placarTimeB);
        new JogoBO().gerarRelatorio(relat);

    }
}
