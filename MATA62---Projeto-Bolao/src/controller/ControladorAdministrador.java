package controller;

import javax.swing.JOptionPane;
import bolao.Executavel;
import static bolao.Executavel.lAdministradores;
import views.CadastrarApostador;
import java.io.IOException;
import model.bo.AdministradorBO;
import model.dao.AdministradorDAO;

public class ControladorAdministrador {

    static Executavel executavel;

    public static void gerar_Relatorio() {

    }

    public static void gerar_Relatorio_Funcionario() {

    }

    public static void inserir_Gestor(String nome, String senha, int cpf, String end, int telefone, String usuario) {
        AdministradorBO.inserir_Gestor(nome, senha, cpf, end, telefone, usuario);
        JOptionPane.showMessageDialog(null, " Funcionário Cadastrado com Sucesso!", "Sucesso", 1);
    }

    public static void pesquisa_Gestor(String usuario) {
        boolean cadastrado = false;
        for (int i = 0; i < Executavel.lAdministradores.size(); i++) {
            if (Executavel.lAdministradores.get(i).getUsuario().equalsIgnoreCase(usuario)) {
                String gestor = Executavel.lAdministradores.get(i).getNome();
                CadastrarApostador.jCampoFunc.setText(gestor);
                cadastrado = true;
            }
        }
        if (cadastrado == false) {
            JOptionPane.showMessageDialog(null, " Funcionário não cadastrado!", "Atenção", 1);
        }

    }

    public static void excluir_Gestor(String user) {
        AdministradorBO.excluir_Gestor(user);
        JOptionPane.showMessageDialog(null, " Usuario Excluído com Sucesso!", "Sucesso", 1);
    }

    public static void backup_gerente() {
        AdministradorDAO.salvar(lAdministradores, "administrador.json");
    }

    public static void carregar_backup_ger() throws ClassNotFoundException, IOException {
        new AdministradorDAO().ler("gerentes.json");

    }

}
