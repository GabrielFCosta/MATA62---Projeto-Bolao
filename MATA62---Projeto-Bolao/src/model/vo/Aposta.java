/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.vo;

/**
 *
 * @author guest-78tdco
 */
public class Aposta {

    private Apostador apostador;
    private int identificador;

    private int palpiteA;
    private int palpiteB;
	/**
	 * @return the apostador
	 */
	public Apostador getApostador() {
		return apostador;
	}
	/**
	 * @param apostador the apostador to set
	 */
	public void setApostador(Apostador apostador) {
		this.apostador = apostador;
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
	/**
	 * @return the palpiteA
	 */
	public int getPalpiteA() {
		return palpiteA;
	}
	/**
	 * @param palpiteA the palpiteA to set
	 */
	public void setPalpiteA(int palpiteA) {
		this.palpiteA = palpiteA;
	}
	/**
	 * @return the palpiteB
	 */
	public int getPalpiteB() {
		return palpiteB;
	}
	/**
	 * @param palpiteB the palpiteB to set
	 */
	public void setPalpiteB(int palpiteB) {
		this.palpiteB = palpiteB;
	}

}
