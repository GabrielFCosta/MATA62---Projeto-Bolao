
package model.vo;

import java.io.Serializable;
import java.util.Date;
import model.vo.Pessoa;




public class Aposta implements Serializable {    
    private Date data;
    private int jogo;
    private String bolao;
    private int aposta;
    private String timeA;
    private String timeB;
    private Date horario;

    public Aposta(Date data, Date horario, int aposta, int jogo, String bolao, String timeA, String timeB) {
       
        this.data= null;
        this.horario= null;
        this.jogo = 0;
        this.bolao = null;
        this.aposta = 0;
        this.timeA= null;
        this.timeB= null;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }  

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }

    public String getBolao() {
        return bolao;
    }

    public void setBolao(String bolao) {
        this.bolao = bolao;
    }

    public int getAposta() {
        return aposta;
    }

    public void setAposta(int aposta) {
        this.aposta = aposta;
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

       

    @Override
    public String toString() {
        return super.toString()+ " Data: "  + data + "\n"+
                                 " Horário: "+"\n"+
                                 " Aposta nº"+ aposta + "Bolão do "+bolao;
    }

    
    
    
}