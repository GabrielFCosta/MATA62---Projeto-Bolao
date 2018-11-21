
package model.vo;

public class Jogo {
   private int partida;
   private String timeA;
   private String timeB;
   private int dia;
   private String mes;
   private int ano;

    public Jogo(int partida, String timeA, String timeB, int dia, String mes, int ano) {
        this.partida = partida;
        this.timeA = timeA;
        this.timeB = timeB;
        this.dia =dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return    "Paritna nº  " + partida +
                  " Time anfitrião:  " + timeA +"\n"+
                  " Time visitante:  " + timeB + "   "+  "Data: "+ dia + mes + ano ;
    }

    public int getPartida() {
        return partida;
    }

    public void setPartida(int partida) {
        this.partida = partida;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        this.timeA = timeA;
    }

    public String getTimeB() {
        return timeB;
    }

    public void setTimeB(String timeB) {
        this.timeB = timeB;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
   

}
