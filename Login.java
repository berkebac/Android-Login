package com.example.monary.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView hos = findViewById(R.id.Tv);
        TextView ad = findViewById(R.id.Tv2);
        TextView sif = findViewById(R.id.Tv3);

        String isim = getIntent().getStringExtra("name");
        String sifre = getIntent().getStringExtra("sifre");

        hos.setText("HOSGELDINIZ");
        ad.setText(isim.toUpperCase());
        sif.setText("Sifreniz : " + sifre);


    }
}
