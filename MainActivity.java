package com.example.monary.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText isimView= findViewById(R.id.AdsoyadEt);
        final EditText soyisimView= (EditText) findViewById(R.id.sifreEt);
        Button loginButton= (Button) findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String isim=isimView.getText().toString();
                String sifre=soyisimView.getText().toString();
                if(isim!= "" || sifre!= "")
                {
                    Intent intent = new Intent(MainActivity.this,Login.class);
                    intent.putExtra("name",isim);
                    intent.putExtra("sifre",sifre);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(MainActivity.this,"Bilgiler boş geçilemez",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        }

}
