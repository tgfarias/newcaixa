package br.com.posmobile.newcaixa;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ExtratoFragment extends Fragment {
    private ListView lvExtrato;
    private ExtratoAdapter extratoAdapter;

    public static ExtratoFragment newInstance(int page){
        Bundle args = new Bundle();
        ExtratoFragment fragment = new ExtratoFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_extrato, container, false);
        //TextView textView = (TextView) view;
        //textView.setText("Extrato Fragment #" + mPage);
        lvExtrato = (ListView) view.findViewById(R.id.lvExtrato);
        final List<Extrato> extratoItens = new ArrayList<>();
        extratoItens.add(new Extrato("Outros", "Católica do Tocantins", "15,39", "22:35", R.mipmap.ic_extrato_others));
        extratoItens.add(new Extrato("Saúde", "Fcia Pague Menos", "39,70", "18:15", R.mipmap.ic_extrato_saude));
        extratoItens.add(new Extrato("Supermercado", "Extra Palmas", "12,43", "14:49", R.mipmap.ic_extrato_market));
        extratoItens.add(new Extrato("Transporte", "Posto Flex", "60,00", "19:59", R.mipmap.ic_extrato_transporte));
        extratoItens.add(new Extrato("Lazer", "Cinemark", "34,00", "21:00", R.mipmap.ic_extrato_lazer));


        extratoAdapter = new ExtratoAdapter(getActivity(), extratoItens);
        lvExtrato.setAdapter(extratoAdapter);

        return view;
    }
}
