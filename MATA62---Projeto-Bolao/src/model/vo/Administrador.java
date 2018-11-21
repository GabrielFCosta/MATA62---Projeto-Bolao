
package model.vo;

import java.io.Serializable;
import model.vo.Apostador;
import java.util.ArrayList;


public class Administrador extends Apostador implements Serializable {

    public Administrador(String nome, String senha, int cpf, String end,int telefone, String usuario) {
        super(nome, senha, cpf, end, telefone, usuario);
    }

   
    
     
}
