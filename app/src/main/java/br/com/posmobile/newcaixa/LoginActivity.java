package br.com.posmobile.newcaixa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends Activity {
    private List<Servico> servicos;
    private ServicoAdapter adapter;
    private ListView listView;
    private Button btnContinuar;
    private EditText edUsuario;
    private EditText edSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edUsuario = (EditText) findViewById(R.id.usuario);
        edSenha = (EditText) findViewById(R.id.senha);
        btnContinuar = (Button) findViewById(R.id.btnContinuar);
        listView = (ListView) findViewById(R.id.lvServicosLogin);

        servicos = new ArrayList<Servico>();
        servicos.add(new Servico("Como acessar sua conta", "Ajuda"));
        servicos.add(new Servico("Negociação de dívidas", "Contratos em atraso"));
        servicos.add(new Servico("Loterias caixa", "Produtos"));
        servicos.add(new Servico("Simulador de Habitação", "Atendimento"));
        servicos.add(new Servico("Rede de Atendimento", "Atendimento"));
        servicos.add(new Servico("Telefones Caixa", "Atendimento"));

        adapter = new ServicoAdapter(this, servicos);
        listView.setAdapter(adapter);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = edUsuario.getText().toString();
                String senha = edSenha.getText().toString();
//                if(usuario.length() == 0)
//                    edUsuario.setError("Campo usuário obrigatório");
//                else if(senha.length() == 0)
//                    edSenha.setError("Campo senha obrigatório");
//                else
                    login(usuario, senha);
            }
        });
    }

    private void login(String user, String pass)
    {
//        if(!user.equals("Cliente")){
//            edUsuario.setError("Usuário não cadastrado/ativo");
//            edUsuario.setFocusable(true);
//        }
//        else if(!pass.equals("123entrar")) {
//            edSenha.setError("Senha incorreta, tente novamente");
//            edSenha.setText("");
//            edSenha.setFocusable(true);
//        }
//        else
//        {
            Toast.makeText(this, "Login realizado com sucesso", Toast.LENGTH_LONG).show();
            edUsuario.setText("");
            edSenha.setText("");
            Intent i = new Intent(LoginActivity.this, LogonActivity.class);
            startActivity(i);
//        }
    }
}
