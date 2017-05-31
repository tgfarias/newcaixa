package br.com.posmobile.newcaixa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends Activity {
    private List<Servico> servicos;
    private ServicoAdapter adapter;
    private ListView listView;

    private Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnEntrar = (Button) findViewById(R.id.btn_entrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrincipalActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

        listView = (ListView) findViewById(R.id.lvServicos);
        //setContentView(listView);

        servicos = new ArrayList<Servico>();
        servicos.add(new Servico("Como acessar sua conta", "Ajuda"));
        servicos.add(new Servico("Negociação de dívidas", "Contratos em atraso"));
        servicos.add(new Servico("Loterias caixa", "Produtos"));
        servicos.add(new Servico("Simulador de Habitação", "Atendimento"));
        servicos.add(new Servico("Rede de Atendimento", "Atendimento"));
        servicos.add(new Servico("Telefones Caixa", "Atendimento"));

        adapter = new ServicoAdapter(this, servicos);
        listView.setAdapter(adapter);

    }
}
