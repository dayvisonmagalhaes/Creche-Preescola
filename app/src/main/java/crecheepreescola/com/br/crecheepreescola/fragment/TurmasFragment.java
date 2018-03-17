package crecheepreescola.com.br.crecheepreescola.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import crecheepreescola.com.br.crecheepreescola.R;
import crecheepreescola.com.br.crecheepreescola.adapter.TurmaAdapter;
import crecheepreescola.com.br.crecheepreescola.domain.Turma;
import crecheepreescola.com.br.crecheepreescola.service.TurmaService;

/**
 * A simple {@link Fragment} subclass.
 */
public class TurmasFragment extends BaseFragment {
    private String tipo;
    protected RecyclerView recyclerView;
    private List<Turma> turmas;
    private LinearLayoutManager mLayoutManager;

    /*
    // Método para instanciar esse fragment pelo tipo.
    public static TurmasFragment newInstance(String tipo) {
        Bundle args = new Bundle();
        args.putString("tipo", tipo);
        TurmasFragment f = new TurmasFragment();
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // Lê o tipo dos argumentos.
            this.tipo = getArguments().getString("tipo");
        }
    }
    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_turmas, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        return view;

        /*
        // FAB
        view.findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snack(recyclerView,"Exemplo de FAB Button.");
            }
        });


        return view;
        */
    }


        public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        taskTurmas();
    }

    private void taskTurmas() {
        // Busca os turmas
        this.turmas = TurmaService.getTurmas(getContext());
        // Atualiza a lista
        recyclerView.setAdapter(new TurmaAdapter(getContext(), turmas, onClickTurma()));
    }

    private TurmaAdapter.TurmaOnClickListener onClickTurma() {
        return new TurmaAdapter.TurmaOnClickListener() {
            @Override
            public void onClickTurma(View view, int idx) {
                Turma t = turmas.get(idx);
                Toast.makeText(getContext(), "Turma: " +t.nome, Toast.LENGTH_SHORT).show();


            }
        };
    }
}
