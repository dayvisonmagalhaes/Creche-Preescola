package crecheepreescola.com.br.crecheepreescola.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import crecheepreescola.com.br.crecheepreescola.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Diario_frag extends android.support.v4.app.Fragment {


    public Diario_frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_diario_frag, container, false);

        //Lógica do fragment

        return view;
    }

}
