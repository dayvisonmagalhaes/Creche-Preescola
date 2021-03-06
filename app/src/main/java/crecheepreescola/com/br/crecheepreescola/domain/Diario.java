package crecheepreescola.com.br.crecheepreescola.domain;

import java.util.Date;

/**
 * Created by Dayvison_Not on 13/03/2018.
 */

public class Diario {

    private int id;
    private Date data;
    private String mamadeira;
    private String lancheManha;
    private String almoco;
    private String lancheTarde;
    private String jantar;
    private String remedios;
    private String participacao;
    private String sono;
    private String tempoSono;
    private String evacuacao;
    private String resumoDia;
    private int alunoId;

    @Override
    public String toString() {
        return "Diario{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMamadeira() {
        return mamadeira;
    }

    public void setMamadeira(String mamadeira) {
        this.mamadeira = mamadeira;
    }

    public String getLancheManha() {
        return lancheManha;
    }

    public void setLancheManha(String lancheManha) {
        this.lancheManha = lancheManha;
    }

    public String getAlmoco() {
        return almoco;
    }

    public void setAlmoco(String almoco) {
        this.almoco = almoco;
    }

    public String getLancheTarde() {
        return lancheTarde;
    }

    public void setLancheTarde(String lancheTarde) {
        this.lancheTarde = lancheTarde;
    }

    public String getJantar() {
        return jantar;
    }

    public void setJantar(String jantar) {
        this.jantar = jantar;
    }

    public String getRemedios() {
        return remedios;
    }

    public void setRemedios(String remedios) {
        this.remedios = remedios;
    }

    public String getParticipacao() {
        return participacao;
    }

    public void setParticipacao(String participacao) {
        this.participacao = participacao;
    }

    public String getSono() {
        return sono;
    }

    public void setSono(String sono) {
        this.sono = sono;
    }

    public String getTempoSono() {
        return tempoSono;
    }

    public void setTempoSono(String tempoSono) {
        this.tempoSono = tempoSono;
    }

    public String getEvacuacao() {
        return evacuacao;
    }

    public void setEvacuacao(String evacuacao) {
        this.evacuacao = evacuacao;
    }

    public String getResumoDia() {
        return resumoDia;
    }

    public void setResumoDia(String resumoDia) {
        this.resumoDia = resumoDia;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }
}
