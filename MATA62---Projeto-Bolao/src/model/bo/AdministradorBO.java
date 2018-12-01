package model.bo;

import model.dao.AdministradorDAO;
import model.vo.Administrador;
import bolao.Executavel;
import static bolao.Executavel.lAdministradores;

/**
 *
 * @author FABIO
 */
public class AdministradorBO {

    static Executavel executavel;

    public static void inserir_Gestor(String nome, String senha, int cpf, String end, int telefone, String usuario) {
        Administrador a = new Administrador();
        a.setNome(nome);
        a.setSenha(senha);
        a.setCpf(cpf);
        a.setEnd(end);
        a.setTelefone(telefone);
        a.setUsuario(usuario);
        Executavel.lAdministradores.add(a);

    }

    public static void excluir_Gestor(String usuario) {

        for (int i = 0; i < Executavel.lAdministradores.size(); i++) {
            if (Executavel.lAdministradores.get(i).getUsuario().equalsIgnoreCase(usuario)) {
                Executavel.lAdministradores.remove(i);
                AdministradorDAO.salvar(lAdministradores, "Administradores.json");
            }

        }
    }

}
