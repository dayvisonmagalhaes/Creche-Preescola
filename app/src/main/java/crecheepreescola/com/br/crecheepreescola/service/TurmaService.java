package crecheepreescola.com.br.crecheepreescola.service;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import crecheepreescola.com.br.crecheepreescola.domain.Turma;

/**
 * Created by u6390869 on 16/03/2018.
 */

public class TurmaService {

    public static List<Turma> getTurmas(Context context ){
        List<Turma> turmas = new ArrayList<Turma>();
        for (int i = 0; i<20;i++){
            Turma t = new Turma();
            t.nome = "Carro " + i;
            t.desc = "Desc " + i;
            t.urlFoto = "http://www.livroandroid.com.br/livro/carros/esportivos/Ferrari_FF.png";
            turmas.add(t);
        }
        return turmas;
    }
}
