package controller;

import java.io.IOException;
import javax.swing.JOptionPane;
import model.bo.ApostaBO;
import model.dao.ApostaDAO;
import model.vo.Apostador;
import model.vo.Administrador;
import bolao.Executavel;
import java.util.Date;
import model.vo.Bolao;
import model.vo.Jogo;

public class ControladorPrincipal {

    static Executavel executavel;

    public static void validar_entrada(Apostador apostador, Jogo identificador, Date data, Date horario, int palpiteA, int palpiteB, Bolao bolao) {
        ApostaBO.validar_Aposta(apostador, identificador, data, horario, palpiteA, palpiteB, bolao);
    }

    public static void identifica_Funcionario(String usuario) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador apostador : Executavel.lApostadores) {
            if (apostador.getUsuario().equalsIgnoreCase(usuario)) {
                String nome = apostador.getNome();
                int cpf = apostador.getCpf();
//                String Setor2 = f.getSetor();
//                FrmPrincipal.jNomeFunc.setText(func);
//                FrmPrincipal.jCargoFunc.setText(cargo2);
//                FrmPrincipal.jCampoSetor.setText(Setor2);
                validadorF = 1;

            }
        }
        for (Administrador adm : Executavel.lAdministradores) {
            if (adm.getUsuario().equalsIgnoreCase(usuario)) {
                String nome = adm.getNome();
                int cpf = adm.getCpf();
//                String Setor2 = g.getSetor();
//                FrmPrincipal.jNomeFunc.setText(func);
//                FrmPrincipal.jCargoFunc.setText(cargo2);
//                FrmPrincipal.jCampoSetor.setText(Setor2);
                validadorG = 1;

            }
        }
        if (validadorF == 0 && validadorG == 0) {

            JOptionPane.showMessageDialog(null, " Funcionário não cadastrado!", "Atenção", 1);
//            FrmPrincipal.jCampoMat1.setText("");
        }
    }

    public static void identifica_Funcionario2(String usuario) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador apostador : Executavel.lApostadores) {
            if (apostador.getUsuario().equalsIgnoreCase(usuario)) {
                String nome = apostador.getNome();
                int cpf = apostador.getCpf();
//                Relatorio.jNomeFuncRelat.setText(nome);
//                Relatorio.jCargoFuncRelat.setText(String.valueOf(cpf));
//                Relatorio.jCampoSetorRelat.setText(usuario);
//                Relatorio.jBGeraRelat.setEnabled(true);
                validadorF = 1;

            }
        }
        for (Administrador adm : Executavel.lAdministradores) {
            if (adm.getUsuario().equalsIgnoreCase(usuario)) {
                String func = adm.getNome();
                int cpf = adm.getCpf();
//                Relatorio.jNomeFuncRelat.setText(func);
//                Relatorio.jCargoFuncRelat.setText(cargo2);
//                Relatorio.jCampoSetorRelat.setText(Setor2);
//                Relatorio.jBGeraRelat.setEnabled(true);
                validadorG = 1;

            }
        }
        if (validadorF == 0 && validadorG == 0) {

            JOptionPane.showMessageDialog(null, " Funcionário não cadastrado!", "Atenção", 1);
//            FrmPrincipal.jCampoMat1.setText("");
        }
    }

    public static void valida_Funcionario(String senha, String usuario) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador apostador : Executavel.lApostadores) {
            if (apostador.getSenha().equals(senha) && apostador.getUsuario().equalsIgnoreCase(usuario)) {

                validadorF = 1;
            }

        }
        for (Administrador adm : Executavel.lAdministradores) {
            if (adm.getSenha().equals(senha) && adm.getUsuario().equalsIgnoreCase(usuario)) {

                validadorG = 1;
            }
        }
        if (validadorF == 0 && validadorG == 0) {

//            JOptionPane.showMessageDialog(null, " Senha Incorreta! ", "VALIDAÇÃO DE FUNCIONARIO NEGADA!", 0);
//            FrmPrincipal.jCampoSenhaFunc.setText("");
        }

    }

    public static void carregar_backup_reg() throws ClassNotFoundException, IOException {
        new ApostaDAO().ler("registros.json");

    }

}
