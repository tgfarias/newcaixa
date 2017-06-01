package br.com.posmobile.newcaixa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tiagocosta on 31/05/2017.
 */

public class ServicoAdapter extends BaseAdapter {
    Context ctx;
    List<Servico> servicos;

    public ServicoAdapter(Context ctx, List<Servico> servicos) {
        this.ctx = ctx;
        this.servicos = servicos;
    }

    @Override
    public int getCount() {
        return servicos.size();
    }

    @Override
    public Object getItem(int position) {
        return servicos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Servico servico = servicos.get(position);
        View linha = LayoutInflater.from(ctx).inflate(R.layout.item_servicos, null);
        TextView tvTitulo = (TextView) linha.findViewById(R.id.tvLocal);
        TextView tvSubtitulo = (TextView) linha.findViewById(R.id.tvValor);
        ImageView ivSeta = (ImageView) linha.findViewById(R.id.ivIcon);
        //Resources res = ctx.getResources();
        tvTitulo.setText(servico.titulo);
        tvSubtitulo.setText(servico.subtitulo);
        ivSeta.setImageResource(R.drawable.ic_chevron_right_black_24dp);

        return linha;
    }
}
