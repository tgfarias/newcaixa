package br.com.posmobile.newcaixa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiagocosta on 31/05/2017.
 */

public class LogonFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";
    private ListView lvMenuItens;
    private int mPage;
    private InternoAdapter internoAdapter;

    public static LogonFragment newInstance(int page){
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        LogonFragment fragment = new LogonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_logon, container, false);
        //TextView textView = (TextView) view;
        //textView.setText("Fragment #" + mPage);

        lvMenuItens = (ListView) view.findViewById(R.id.lvMenuItens);
        final List<String> menuItens = new ArrayList<>();
        menuItens.add("Minha conta");
        menuItens.add("Extrato");
        menuItens.add("Transferências");
        menuItens.add("Loterias");
        menuItens.add("Cartões");
        menuItens.add("FGTS e INSS");

        internoAdapter = new InternoAdapter(getActivity(), menuItens);
        lvMenuItens.setAdapter(internoAdapter);

        lvMenuItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
               {

                   case 1:
                       Intent it = new Intent(getActivity(), ExtratoActivity.class);
                       startActivity(it);

                   case 3:
                       Intent it2 = new Intent(getActivity(), ExtratoActivity.class);
                       startActivity(it2);
                   default:
                       Toast.makeText(getContext(), menuItens.get(position) + " clicado!!", Toast.LENGTH_LONG).show();
               }
            }
        });
        return view;
    }
}
