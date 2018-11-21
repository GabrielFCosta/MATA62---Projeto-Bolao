
package bolao;

import views.FrmPrincipal;
import controller.ControladorApostador;
import model.vo.Aposta;
import model.vo.Administrador;
import java.util.ArrayList;
import java.util.List;
import model.bo.ApostadorBO;
import model.vo.Apostador;


public class Executavel {

    
    public static List<Apostador> lApostadores;
    public static List<Administrador> lAdministradores;
    public static List<Aposta> lApostas;
    
    public static FrmPrincipal janelaPrincipal;
    
    public static void main(String[] args) {
        
       lApostadores = new ArrayList<Apostador>();
       lAdministradores = new ArrayList<Administrador>();
       lApostas = new ArrayList<Aposta>();
       janelaPrincipal = new FrmPrincipal();
       janelaPrincipal.setVisible(true);
             
    
    
    }
}
