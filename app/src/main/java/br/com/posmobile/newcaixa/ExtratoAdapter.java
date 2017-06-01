package br.com.posmobile.newcaixa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by tiagocosta on 01/06/2017.
 */

public class ExtratoAdapter extends BaseAdapter {

    Context ctx;
    List<Extrato> extratos;

    public ExtratoAdapter(Context ctx, List<Extrato> extratos) {
        this.ctx = ctx;
        this.extratos = extratos;
    }

    @Override
    public int getCount() {
        return extratos.size();
    }

    @Override
    public Object getItem(int position) {
        return extratos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Extrato extrato = extratos.get(position);
        View linha = LayoutInflater.from(ctx).inflate(R.layout.item_extrato, null);
        TextView tvCat = (TextView) linha.findViewById(R.id.tvCat);
        TextView tvLocal = (TextView) linha.findViewById(R.id.tvLocal);
        TextView tvValor = (TextView) linha.findViewById(R.id.tvValor);
        TextView tvHora = (TextView) linha.findViewById(R.id.tvHora);
        ImageView ivIcon = (ImageView) linha.findViewById(R.id.ivIcon);

        tvCat.setText(extrato.categoria);
        tvLocal.setText(extrato.local);
        tvValor.setText("R$ " + extrato.valor);
        tvHora.setText(extrato.hora);
        ivIcon.setImageResource(R.mipmap.ic_extrato_others);
        return linha;

    }
}
