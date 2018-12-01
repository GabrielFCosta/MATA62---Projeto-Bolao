package model.bo;

import model.dao.ApostaDAO;
import model.vo.Aposta;
import bolao.Executavel;
import static bolao.Executavel.lApostas;
import java.util.Date;
import model.vo.Apostador;
import model.vo.Bolao;
import model.vo.Jogo;

/**
 *
 * @author FABIO
 */
public class ApostaBO {

    static Executavel executavel;

    public static void validar_Aposta(Apostador apostador, Jogo identificador, Date data, Date horario, int palpiteA, int palpiteB, Bolao bolao) {
        if (Executavel.lApostas.isEmpty()) {
            Aposta p = new Aposta(apostador, identificador, data, horario, palpiteA, palpiteB, bolao);
            Executavel.lApostas.add(p);
            new ApostaDAO().salvar(lApostas, "registros.json");

        }

    }
}
