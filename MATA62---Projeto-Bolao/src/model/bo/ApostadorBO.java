package model.bo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.dao.ApostadorDAO;
import model.vo.Apostador;
import bolao.Executavel;
import static bolao.Executavel.lApostadores;

/**
 *
 * @author FABIO
 */
public class ApostadorBO {

    static Executavel executavel;

    public static void inserir_Apostador(String nome, String senha, int cpf, String end, int telefone, String usuario) {
        Apostador t = new Apostador();
        t.setNome(nome);
        t.setSenha(senha);
        t.setCpf(cpf);
        t.setEnd(end);
        t.setTelefone(telefone);
        t.setUsuario(usuario);
        Executavel.lApostadores.add(t);

    }

    public void excluir_Apostador(int cpf) {

        for (int i = 0; i < Executavel.lApostadores.size(); i++) {
            if (Executavel.lApostadores.get(i).getCpf() == cpf) {
                Executavel.lApostadores.remove(i);
                ApostadorDAO.salvar(lApostadores, "Apostadores.json");

            }
        }
    }

}
