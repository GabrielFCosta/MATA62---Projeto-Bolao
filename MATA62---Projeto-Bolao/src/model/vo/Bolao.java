/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guest-78tdco
 */
public class Bolao {

    private List<Aposta> listaAposta = new ArrayList<>();
    private int identificador;
	/**
	 * @return the listaAposta
	 */
	public List<Aposta> getListaAposta() {
		return listaAposta;
	}
	/**
	 * @param listaAposta the listaAposta to set
	 */
	public void setListaAposta(List<Aposta> listaAposta) {
		this.listaAposta = listaAposta;
	}
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

}
