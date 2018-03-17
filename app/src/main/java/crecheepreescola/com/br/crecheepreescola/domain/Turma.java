package crecheepreescola.com.br.crecheepreescola.domain;

import java.io.Serializable;

/**
 * Created by u6390869 on 16/03/2018.
 */

public class Turma implements Serializable{
    private static final long serialVersionUID = 661006766832473959L;
    public long id;
    public String tipo;
    public String nome;
    public String desc;
    public String urlFoto;
    public String urlInfo;
    public String urlVideo;
    public String latitude;
    public String longitude;

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                '}';
    }


}
