package br.com.posmobile.newcaixa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends Activity {

    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                mostrarLogin();
            }
        }, 2000);

//        imgView = (ImageView) findViewById(R.id.fullscreen_content);
//
//        imgView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(SplashActivity.this, PrincipalActivity.class);
//                startActivity(i);
//            }
//        });

    }

    private void mostrarLogin() {
        Intent intent = new Intent(SplashActivity.this,
                PrincipalActivity.class);
        startActivity(intent);
        finish();
    }

}
