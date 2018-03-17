package crecheepreescola.com.br.crecheepreescola.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import crecheepreescola.com.br.crecheepreescola.R;
import crecheepreescola.com.br.crecheepreescola.domain.Turma;

/**
 * Created by Dayvison_Not on 15/03/2018.
 */

public class TurmaAdapter extends RecyclerView.Adapter<TurmaAdapter.TurmaViewHolder>{

    protected static final String TAG = "livroandroid";
    private final List<Turma> turmas;
    private final Context context;
    private TurmaOnClickListener turmaOnClickListener;

    public TurmaAdapter (Context context, List<Turma> turmas, TurmaOnClickListener turmaOnClickListener){
        this.context = context;
        this.turmas = turmas;
        this.turmaOnClickListener = turmaOnClickListener;
    }


    @Override
    public int getItemCount() {
        return this.turmas != null ? this.turmas.size() : 0;
    }




    @Override
    public TurmaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_turma, parent, false );
        TurmaViewHolder holder = new TurmaViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final TurmaViewHolder holder, final int position) {
        // Atualiza a view
        Turma t = turmas.get(position);
        holder.tNome.setText(t.nome);
        holder.progress.setVisibility(View.VISIBLE);
        // Faz o download da foto e mostra o ProgressBar
        Picasso.with(context).load(t.urlFoto).fit().into(holder.img,
                new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {
                        holder.progress.setVisibility(View.GONE); // download ok
                    }

                    @Override
                    public void onError() {
                        holder.progress.setVisibility(View.GONE);
                    }
                });
        // Click
        if (turmaOnClickListener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // A variável position é final
                    turmaOnClickListener.onClickTurma(holder.itemView, position);
                }
            });
        }
    }


    public interface TurmaOnClickListener{
        public void onClickTurma (View view, int idx);
    }

    //ViewHolder com as views
    public static class TurmaViewHolder extends RecyclerView.ViewHolder {
        public TextView tNome;
        ImageView img;
        ProgressBar progress;
        CardView cardView;

        public TurmaViewHolder(View view) {
            super(view);
            // Cria as views para salvar no ViewHolder
            tNome = (TextView) view.findViewById(R.id.text);
            img = (ImageView) view.findViewById(R.id.imgTurma);
            progress = (ProgressBar) view.findViewById(R.id.progressImg);
            cardView = (CardView) view.findViewById(R.id.card_viewTurma);
        }
    }
}
