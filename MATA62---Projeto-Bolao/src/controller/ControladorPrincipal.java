package controller;

import views.FrmPrincipal;
import views.Relatorio;
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

    public static void validar_saida_intervalo(String nome, int matricula, String cargo, String setor, String mes, int dia, int ano, String saida_intervalo) {
        new ApostaBO().validar_saida_intervalo(nome, matricula, cargo, setor, mes, dia, ano, saida_intervalo);
    }

    public static void validar_retorno_intervalo(String nome, int matricula, String cargo, String setor, String mes, int dia, int ano, String ent_intervalo) {
        new ApostaBO().validar_retorno_intervalo(nome, matricula, cargo, setor, mes, dia, ano, ent_intervalo);
    }

    public static void validar_saida(String nome, int matricula, String cargo, String setor, String mes, int dia, int ano, String saida) {
        new ApostaBO().validar_saida(nome, matricula, cargo, setor, mes, dia, ano, saida);
    }

    public static void identifica_Funcionario(int matricula) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador f : executavel.lFuncionarios) {
            if (f.getMatricula() == matricula) {
                String func = f.getNome();
                String cargo2 = f.getCargo();
                String Setor2 = f.getSetor();
                FrmPrincipal.jNomeFunc.setText(func);
                FrmPrincipal.jCargoFunc.setText(cargo2);
                FrmPrincipal.jCampoSetor.setText(Setor2);
                validadorF = 1;

            }
        }
        for (Administrador g : executavel.lGerentes) {
            if (g.getMatricula() == matricula) {
                String func = g.getNome();
                String cargo2 = g.getCargo();
                String Setor2 = g.getSetor();
                FrmPrincipal.jNomeFunc.setText(func);
                FrmPrincipal.jCargoFunc.setText(cargo2);
                FrmPrincipal.jCampoSetor.setText(Setor2);
                validadorG = 1;

            }
        }
        if (validadorF == 0 && validadorG == 0) {

            JOptionPane.showMessageDialog(null, " Funcionário não cadastrado!", "Atenção", 1);
            FrmPrincipal.jCampoMat1.setText("");
        }
    }

    public static void identifica_Funcionario2(int matricula) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador f : executavel.lFuncionarios) {
            if (f.getMatricula() == matricula) {
                String func = f.getNome();
                String cargo2 = f.getCargo();
                String Setor2 = f.getSetor();
                Relatorio.jNomeFuncRelat.setText(func);
                Relatorio.jCargoFuncRelat.setText(cargo2);
                Relatorio.jCampoSetorRelat.setText(Setor2);
                Relatorio.jBGeraRelat.setEnabled(true);
                validadorF = 1;

            }
        }
        for (Administrador g : executavel.lGerentes) {
            if (g.getMatricula() == matricula) {
                String func = g.getNome();
                String cargo2 = g.getCargo();
                String Setor2 = g.getSetor();
                Relatorio.jNomeFuncRelat.setText(func);
                Relatorio.jCargoFuncRelat.setText(cargo2);
                Relatorio.jCampoSetorRelat.setText(Setor2);
                Relatorio.jBGeraRelat.setEnabled(true);
                validadorG = 1;

            }
        }
        if (validadorF == 0 && validadorG == 0) {

            JOptionPane.showMessageDialog(null, " Funcionário não cadastrado!", "Atenção", 1);
            FrmPrincipal.jCampoMat1.setText("");
        }
    }

    public static void valida_Funcionario(String senha, int matricula) {
        int validadorF = 0;
        int validadorG = 0;
        for (Apostador f : executavel.lFuncionarios) {
            if (f.getSenha().equals(senha) && f.getMatricula() == matricula) {
                FrmPrincipal.jBtnEnt.setEnabled(true);
                FrmPrincipal.jBtnEntInt.setEnabled(true);
                FrmPrincipal.jBtnSaidaInt.setEnabled(true);
                FrmPrincipal.jBtnSaida.setEnabled(true);
                validadorF = 1;
            }

        }
        for (Administrador g : executavel.lGerentes) {
            if (g.getSenha().equals(senha) && g.getMatricula() == matricula) {
                FrmPrincipal.jBtnEnt.setEnabled(true);
                FrmPrincipal.jBtnEntInt.setEnabled(true);
                FrmPrincipal.jBtnSaidaInt.setEnabled(true);
                FrmPrincipal.jBtnSaida.setEnabled(true);
                FrmPrincipal.jBtnGerenciar.setEnabled(true);
                FrmPrincipal.jBRelatorio.setEnabled(true);
                validadorG = 1;
            }
        }
        if (validadorF == 0 && validadorG == 0) {

            JOptionPane.showMessageDialog(null, " Senha Incorreta! ", "VALIDAÇÃO DE FUNCIONARIO NEGADA!", 0);
            FrmPrincipal.jCampoSenhaFunc.setText("");
        }

    }

    public static void carregar_backup_reg() throws ClassNotFoundException, IOException {
        new ApostaDAO().ler("registros.json");

    }

}
