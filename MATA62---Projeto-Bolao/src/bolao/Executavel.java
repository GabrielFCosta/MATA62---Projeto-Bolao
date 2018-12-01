package bolao;

import views.FrmPrincipal;
import model.vo.Aposta;
import model.vo.Administrador;
import java.util.ArrayList;
import java.util.List;
import model.vo.Apostador;

public class Executavel {

    public static List<Apostador> lApostadores;
    public static List<Administrador> lAdministradores;
    public static List<Aposta> lApostas;

    public static FrmPrincipal janelaPrincipal;

    public static void main(String[] args) {

        lApostadores = new ArrayList<>();
        lAdministradores = new ArrayList<>();
        lApostas = new ArrayList<>();
        janelaPrincipal = new FrmPrincipal();
        janelaPrincipal.setVisible(true);

    }
}
