package br.com.posmobile.newcaixa;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tiagocosta on 01/06/2017.
 */

public class InternoAdapter extends BaseAdapter {
    Context context;
    List<String> menuitens;

    public InternoAdapter (Context ctx, List<String> menuitens){
        this.context = ctx;
        this.menuitens = menuitens;
    }
    @Override
    public int getCount() {
        return menuitens.size();
    }

    @Override
    public Object getItem(int position) {
        return menuitens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String menuitem = menuitens.get(position);
        View linha = LayoutInflater.from(context).inflate(R.layout.item_menuinterno, null);
        TextView tvTitulo = (TextView) linha.findViewById(R.id.tvMenu);
        ImageView ivSeta = (ImageView) linha.findViewById(R.id.ivSeta);

        tvTitulo.setText(menuitem);
        ivSeta.setImageResource(R.drawable.ic_chevron_right_black_24dp);

        return linha;
    }
}
